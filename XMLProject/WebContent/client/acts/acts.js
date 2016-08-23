(function(angular) {

	angular.module('acts', [ 'actsResource' ]).controller('actsCtrl',
			function($scope,Acts) {
			
			$scope.act = {};
			$scope.addAct = function(){
				Acts.addAct({ act : act});
			}			
		})

}(angular))