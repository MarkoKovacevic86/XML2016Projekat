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
		
		$scope.getAcceptedAmendments = function(act,index){
			$scope.amendments = [];
			$scope.acceptedAM = Amendments.getAcceptedAmendments({id : act.oznaka.value});
			$scope.acceptedAM.$promise.then(function(data){
				$scope.amendments[index] = data.results.bindings;
			
			})
		}
	}
		$scope.uploadAct = function() {
			var file = document.getElementById('file').files[0];
			console.log(file);
			var fileReader = new FileReader();
			fileReader.onloadend = function(e) {
				var data = e.target.result;
				console.log(">>>>>>>>>>>>>>>" + data + " <<<<<<<<<<<<<<<<<<<<<<<<")
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
							init();
						})
			}
			fileReader.readAsBinaryString(file);
		}
		
		$scope.pdf = function(act) {
			$http(
					{
						method : "POST",
						url : "http://localhost:8081/XMLProject/rest/acts/actPDF/"
								+ act.oznaka.value,
						responseType : 'arraybuffer'
					}).then(function(result) {
				var file = new Blob([ result.data ], {
					type : 'application/pdf'
				});
				var fileURL = URL.createObjectURL(file);
				window.open(fileURL);
			}, function(reason) {
				console.log(JSON.stringify(reason));
			});
		}

		$scope.pdfAmendment = function(a) {
			var id = a.amandman.value.split("doneti/")[1];
			$http(
					{
						method : "POST",
						url : "http://localhost:8081/XMLProject/rest/amendments/amendmentPDF/"
								+ id,
						responseType : 'arraybuffer'
					}).then(function(result) {
				var file = new Blob([ result.data ], {
					type : 'application/pdf'
				});
				var fileURL = URL.createObjectURL(file);
				window.open(fileURL);
			}, function(reason) {
				console.log(JSON.stringify(reason));
			});
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
			
		}
		
		$scope.pdf = function(act) {
			$http(
					{
						method : "POST",
						url : "http://localhost:8081/XMLProject/rest/acts/actInProcedurePDF/"
								+ act.oznaka.value,
						responseType : 'arraybuffer'
					}).then(function(result) {
				var file = new Blob([ result.data ], {
					type : 'application/pdf'
				});
				var fileURL = URL.createObjectURL(file);
				window.open(fileURL);
			}, function(reason) {
				console.log(JSON.stringify(reason));
			});
		}
		
		
		$scope.povuciAkt = function(akt){
			console.log("Povlacim akt u proceduri " + akt.oznaka.value )
			Acts.deleteAct({id : akt.oznaka.value},init)
			init();
		}
	
		
	})
}(angular))