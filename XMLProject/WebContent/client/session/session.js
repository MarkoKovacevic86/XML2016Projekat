(function(angular) {
	angular.module('session', []).controller('sessionCtrl',
			function($scope, Acts, Amendments) {
				
				init();
				$scope.za = 0;
				$scope.protiv = 5;
				function init() {

					$scope.getActs = Acts.getActs();
					$scope.getActs.$promise.then(function(data) {
						$scope.$parent.acts = data.results.bindings;
					})

				}

			})

}(angular))
