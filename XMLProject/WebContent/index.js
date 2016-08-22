(function(angular) {

	var xml = angular.module('xml', [ 'ngRoute', 'ui.router', 'ngStorage',
			'login', 'ngResource', 'ui.bootstrap' ])

	xml.config(config).run(run)
	function config($stateProvider) {
		// $urlRouteProvider.otherwise('#/');
		$stateProvider.state('/#', {
			templateUrl : 'index.html'
		}).state('login', {
			url : '/login',
			templateUrl : 'client/login/login.html',
			controller : 'loginCtrl'
		})
		.state('amendments',{
			url : '/amendments',
			templateUrl : 'client/amendments/amendments.html',
			controller : 'amendmentsCtrl'
		})
		.state('acts',{
			url : '/acts',
			templateUrl : 'client/acts/acts.html',
			controller : 'actsCtrl'
		})
	}

	function run($rootScope, $http, $location, $localStorage, $state) {
		$rootScope.$on('$stateChangeSuccess', function(event, toState,
				toParams, fromState, fromParams) {
			// lista javnih stanja
			var publicStates = [ 'login', 'signup',/* 'entry', */'' ];
			var restrictedState = publicStates.indexOf(toState.name) === -1;
			if (restrictedState && !AuthenticationService.getCurrentUser()) {
				$state.go('login');
			}
		});

	
		
	}

}(angular))