(function(angular) {

	var xml = angular.module('xml', [ 'ngRoute', 'ui.router','ngStorage'])
			
			
	xml.config(config)
	.run(run)
	function config($stateProvider){
		//$urlRouteProvider.otherwise('#/');
		$stateProvider
		.state('/#',{
			templateUrl : 'index.html',
			//controller : ''
		})
		.state('login',{
			url:'/login',
			templateUrl:'client/login/login.html'
			//controller : ''
		})
	}
	
	function run($rootScope, $http, $location,$localStorage,$state){
		$rootScope.$on('$stateChangeSuccess', function (event, toState, toParams, fromState, fromParams) {
	          // lista javnih stanja
	          var publicStates = ['login','signup',/*'entry',*/''];
	          var restrictedState = publicStates.indexOf(toState.name) === -1;
	          if(restrictedState && !AuthenticationService.getCurrentUser()){
	            $state.go('login');
	          }
	        });
	}
	
}(angular))