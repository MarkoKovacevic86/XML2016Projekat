(function(angular) {

	angular.module('actsCtrl', [ 'actsResource' ]).controller('actsCtrl',
			function($scope,Acts) {
			
			$scope.act = {};
			
			$scope.addAct = function(act){
				Acts.addAct({ act : act});
			}			
		})

}(angular))