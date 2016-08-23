(function(angular) {

	var xml = angular.module('xml', [ 'ngRoute', 'ui.router', 'ngStorage',
			'login','acts','amendments' ,'ngResource', 'ui.bootstrap' ])

	xml.config(config).run(run)
	function config($stateProvider) {
		// $urlRouteProvider.otherwise('#/');
		$stateProvider.state('/#', {
			templateUrl : 'index.html'
		}).state('login', {
			url : '/login',
			templateUrl : 'client/login/login.html',
			controller : 'loginCtrl'
		}).state('amendments', {
			url : '/amendments',
			templateUrl : 'client/amendments/amendments.html',
			controller : 'amendmentsCtrl'
		}).state('acts', {
			url : '/acts',
			templateUrl : 'client/acts/acts.html',
			controller : 'actsCtrl'
		})
	}

	function run($rootScope, $http, $location, $localStorage, $state, Login) {
		$rootScope.$on('$stateChangeSuccess', function(event, toState,
				toParams, fromState, fromParams) {
			// lista javnih stanja
			var publicStates = [ 'login', 'acts','amendments',/* 'entry', */'' ];
			var restrictedState = publicStates.indexOf(toState.name) === -1;
			if (restrictedState && !AuthenticationService.getCurrentUser()) {
				$state.go('login');
			}
		});

		$rootScope.logout = function() {
			console.log("Logged Out")
			Login.logout();
		}

		$rootScope.getCurrentUser = function() {
			if (!Login.getCurrentUser()) {
				return undefined;
			} else {
				return Login.getCurrentUser();
			}
		}

		$rootScope.getCurrentUserRole = function() {
			if (!Login.getCurrentUser()) {
				return undefined;
			} else {
				return Login.getCurrentUser().role;
			}
		}

		$rootScope.isLoggedIn = function() {
			if (Login.getCurrentUser()) {
				return true;
			} else {
				return false;
			}
		}

	}

}(angular))