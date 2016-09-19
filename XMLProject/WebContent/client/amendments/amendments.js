
angular
		.module('amendments', [ 'amendmentsResource' ])
		.controller(
				'amendmentsCtrl',
				function($scope, $http, $state, Amendments, Acts) {

					$scope.amendments = {};
					init();
					function init() {
						$scope.act = Acts.getActsInProcedure();
						$scope.act.$promise.then(function(data) {
							$scope.$parent.acts = data.results.bindings;
						})

					}
					$scope.uploadAmendment = function(act, index) {
						var aktic = act.akt.value.substr(53,
								act.akt.value.length)
						var file = document.getElementById(act.naziv.value).files[0];
						console.log(file);
						var fileReader = new FileReader();
						fileReader.onloadend = function(e) {
							console.log("Usao odje ???")
							var data = e.target.result;
							console.log(data)
							$http(
									{
										method : "POST",
										url : 'http://localhost:8081/XMLProject/rest/amendments/suggestAmendment/'
												+ aktic,
										headers : {
											"Content-Type" : "application/xml"
										},
										data : data
									}).success(function() {
										init();
							}).error(function() {
								alert('XML dokument nije validan !')
								init();
							})

						}
						fileReader.readAsBinaryString(file);
						$state.go('/amendments')
					}
					
					
					$scope.pdf = function(a) {
						var id = a.amandman.value.split("u_proceduri/")[1];
						$http(
								{
									method : "POST",
									url : "http://localhost:8081/XMLProject/rest/amendments/amendmentInProcedurePDF/"
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
					

					$scope.hide = false;
					$scope.actAmendments = function(act) {
						$scope.amId = $scope.id ? ($scope.amId = null)
								: act.oznaka.value;
						$scope.actsAM = Amendments.actAmendments({
							id : act.oznaka.value
						});
						$scope.actsAM.$promise.then(function(data) {
							$scope.amendments = data.results.bindings;

						})
						$scope.hide = !$scope.hide;
					}

					$scope.povuciAmandman = function(amId) {
						var s = amId.amandman.value.split("u_proceduri/")[1];
						Amendments.deleteAmendment({
							id : s
						})
					}
				})
