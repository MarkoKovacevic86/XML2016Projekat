(function(angular) {

	angular
			.module('amendments', [ 'amendmentsResource' ])
			.controller(
					'amendmentsCtrl',
					function($scope, Amendments, Acts) {

						$scope.amendments = {};
						
						$scope.act = Acts.getActs();
						$scope.act.$promise.then(function(data) {
							$scope.$parent.acts = data.results.bindings;
						})

						$scope.uploadAmendment = function() {
							var file = document.getElementById('file').files[0];
							console.log(file);
							var fileReader = new FileReader();
							fileReader.onloadend = function(e) {
								console.log("Usao odje ???")
								var data = e.target.result;
								$http({
									method : "POST",
									url : 'http://localhost:8081/XMLProject/rest/amendments/suggestAmendments',
									headers : {
										"Content-Type" : "application/xml"
									},
									data : data
								})

							}
							fileReader.readAsBinaryString(file);
						}
						
						
						$scope.actAmendments = function(act){
							$scope.am = Amendments.actAmendments({id : act.oznaka.value});

						}
						
						$scope.povuciAmandman = function(amId){
							Amendments.deleteAmendment({id : amId})
						}
					})

}(angular))