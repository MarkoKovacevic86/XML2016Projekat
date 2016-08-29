(function(angular) {
	angular
			.module('sessionResource', [ 'ngResource' ])
			.factory(
					'Session',
					function($resource) {
						var Session = $resource(
								'/session',
								{},
								{
									vote : {
										method : 'POST',
										url : 'http://localhost:8081/XMLProject/rest/session/vote'
									}
								})

						return Session;
					})

})