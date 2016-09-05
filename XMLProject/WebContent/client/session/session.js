(function(angular) {
	angular.module('session', []).controller(
			'sessionCtrl',
			function($scope, Acts, Amendments) {

				init();

				function init() {
					$scope.actIP = Acts.getActsInProcedure();
					$scope.actIP.$promise.then(function(data) {
						console.log('aktovi u proceduri')
						$scope.actsInProcedure = data.results.bindings;
						console.log(JSON.stringify($scope.actsInProcedure));
					})
				}
				$scope.hide = false;
				$scope.getActAmendments = function(act) {
					$scope.amId = $scope.id ? ($scope.amId = null)
							: act.oznaka.value;
					$scope.acceptedAM = Amendments.actAmendments({
						id : act.oznaka.value
					});
					$scope.acceptedAM.$promise.then(function(data) {
						$scope.amendments = data.results.bindings;
					})
					$scope.hide = !$scope.hide;
				}

				$scope.voteForAmendment = function(za, protiv,am) {
					if (za > protiv) {
						var s = am.amandman.value.split("u_proceduri/")[1]
						console.log("Amandman prihvacen")
						Amendments.update({id : s});
						init();
					} else if (protiv > za) {
						console.log("Amandman odbijen !")
						var s = am.amandman.value.split("u_proceduri/")[1]
						console.log("Povlacim " + s)
						Amendments.deleteAmendment({id : s})
						init();
					}
				}
				
				

			})

}(angular))
