(function(angular) {

	angular
			.module('amendments', [ 'amendmentsResource' ])
			.controller(
					'amendmentsCtrl',
					function($scope, $http, Amendments, Acts) {

						$scope.amendments = {};

						init();

						function init() {
							$scope.act = Acts.getActsInProcedure();
							$scope.act.$promise.then(function(data) {
								$scope.$parent.acts = data.results.bindings;
							})
						}
						$scope.uploadAmendment = function(act) {
							var aktic = act.akt.value.substr(-4)
							var file = document.getElementById('file').files[0];
							console.log(file);
							var fileReader = new FileReader();
							fileReader.onloadend = function(e) {
								console.log("Usao odje ???")
								var data = e.target.result;
								console.log(data)
								$http(
										{
											method : "POST",
											url : 'http://localhost:8081/XMLProject/rest/amendments/suggestAmendment/'+aktic,
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

						$scope.actAmendments = function(act) {
							$scope.am = Amendments.actAmendments({
								id : act.oznaka.value
							});

						}

						$scope.povuciAmandman = function(amId) {
							Amendments.deleteAmendment({
								id : amId.oznaka.value
							})
						}
					})

}(angular))