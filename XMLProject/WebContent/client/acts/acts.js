(function(angular) {

	angular.module('acts', [ 'actsResource' ]).controller('actsCtrl',
			function($scope,Acts) {
			
			$scope.act = {};
			
			$scope.acts = Acts.getActs()
			console.log(" +++++ " + JSON.stringify($scope.acts));
			
			$scope.addAct = function(){
				Acts.addAct({ act : act});
			}			
		})

}(angular))