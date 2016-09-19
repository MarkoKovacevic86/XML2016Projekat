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
									getActsInProcedure : {
										method : 'GET',
										url : 'http://localhost:8081/XMLProject/rest/acts/getActsInProcedure'
									},
									deleteAct : {
										method : 'DELETE',
										url : 'http://localhost:8081/XMLProject/rest/acts/deleteAct/:id',
										id : '@id'
									},
									getById : {
										method : 'GET',
										url : 'acts/:id',
										id : '@id'

									},
									addAct : {
										method : 'http://localhost:8081/XMLProject/rest/acts/addActOnly/:actId',
										actId : '@actId'
									}
								})
						return Acts;
					})

}(angular))
