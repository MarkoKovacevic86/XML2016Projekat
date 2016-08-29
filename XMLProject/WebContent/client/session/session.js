(function(angular) {
	angular.module('session', []).controller('sessionCtrl',
			function($scope, Acts) {
		
				$scope.getActs = Acts.getActs();
				$scope.getActs.$promise.then(function(data) {
					$scope.$parent.acts = data.results.bindings;
				})
				
				
			})

}(angular))
