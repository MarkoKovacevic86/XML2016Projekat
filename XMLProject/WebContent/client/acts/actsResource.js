(function(angular) {
	angular
			.module('actsResource', [ 'ngResource' ])
			.factory(
					'Acts',
					function($resource) {
						var Acts = $resource(
								'/acts',
								{},
								{
									getActs : {
										method : 'GET',
										url : 'http://localhost:8081/XMLProject/rest/acts/getActs'
									},
									deleteAct : {
										method : 'DELETE',
										url : 'acts/deleteAct/:id',
										id : '@id'
									},
									getById : {
										method : 'GET',
										url : 'acts/:id',
										id : '@id'

									},
									addAct : {
										method : 'POST',
										url : 'http://localhost:8081/XMLProject/rest/acts/addAct/:act',
										act : '@act'
									},
									isArray : false,
									headers : {
										"Content-Type" : "application/xml"
									}
								})
						return Acts;
					})

}(angular))
