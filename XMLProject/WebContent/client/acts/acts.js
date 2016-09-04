(function(angular) {

	angular.module('acts', [ 'actsResource' ])

	.controller('actsCtrl', function($scope,$http, Acts) {

		$scope.act = {};
		
		init();
		
		function init() {
		$scope.act = Acts.getActs();
		$scope.act.$promise.then(function(data) {
			$scope.$parent.acts = data.results.bindings;
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

		$scope.addAct = function() {
			console.log('kova')
			console.log(act)
			Acts.addAct({
				act : act
			});
		}
	}).controller('actsInProcedureCtrl', function($scope,$http, Acts) {
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
		}
		
		$scope.povuciAkt = function(akt){
			Acts.deleteAct({id : akt.oznaka.value})
			init();
		}
	
		
	})
}(angular))