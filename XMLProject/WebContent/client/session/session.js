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
					$scope.amId = $scope.id ? ($scope.amId = null)	: act.oznaka.value;
					$scope.acceptedAM = Amendments.actAmendments({
						id : act.oznaka.value
					});
					$scope.acceptedAM.$promise.then(function(data) {
						console.log("aloooo")
						$scope.amendments = data.results.bindings;
					})
					$scope.hide = !$scope.hide;
				}

			})

}(angular))
