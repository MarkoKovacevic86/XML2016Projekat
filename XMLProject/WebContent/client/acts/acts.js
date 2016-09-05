(function(angular) {

	angular.module('acts', [ 'actsResource' ])

	.controller('actsCtrl', function($scope,$state,$http,Amendments, Acts) {

		$scope.act = {};
		
		init();
		
		function init() {
		$scope.act = Acts.getActs();
		$scope.act.$promise.then(function(data) {
			$scope.$parent.acts = data.results.bindings;
		
		})
		
		$scope.getAcceptedAmendments = function(act){
			$scope.acceptedAM = Amendments.getAcceptedAmendments({id : act.oznaka.value});
			$scope.acceptedAM.$promise.then(function(data){
				$scope.amendments = data.results.bindings;
			})
		}
		
		
		}
		$scope.uploadAct = function() {
			var file = document.getElementById('file').files[0];
			console.log(file);
			var fileReader = new FileReader();
			fileReader.onloadend = function(e) {
				var data = e.target.result;
				console.log(data)
			$http({
							method : "POST",
							url : 'http://localhost:8081/XMLProject/rest/acts/addAct',
							headers : {
								"Content-Type": "application/xml"
							},
							data : data
						}).success(function(){
							init();
						}).error(function(){
							alert('XML dokument nije validan !')
						})
			}
			fileReader.readAsBinaryString(file);
		}

	}).controller('actsInProcedureCtrl', function($scope,$state,$http, Acts) {
		init();
		
		function init() {
		$scope.actIP = Acts.getActsInProcedure();
		$scope.actIP.$promise.then(function(data) {
			console.log('aktovi u proceduri')
			$scope.$parent.actsInProcedure = data.results.bindings;
		})
		}

		$scope.uploadAct = function() {
			var file = document.getElementById('file').files[0];
			console.log(file);
			var fileReader = new FileReader();
			fileReader.onloadend = function(e) {
				var data = e.target.result;
				console.log(data)
				$http({
					method : "POST",
					url : 'http://localhost:8081/XMLProject/rest/acts/addAct',
					headers : {
						"Content-Type" : "application/xml"
					},
					data : data
				}).success(function() {
					init();
				}).error(function() {
					alert('XML dokument nije validan !')
				})
			}
			fileReader.readAsBinaryString(file);
			$state.go('actsInProcedure')
		}
		
		$scope.povuciAkt = function(akt){
			console.log("Povlacim akt u proceduri " + akt.oznaka.value )
			Acts.deleteAct({id : akt.oznaka.value})
			init();
		}
	
		
	})
}(angular))