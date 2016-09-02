(function(angular) {
	angular.module('amendmentsResource', [ 'ngResource' ]).factory(
			'Amendments', function($resource) {
				var Amendments = $resource('/amendments', {}, {
					getAmendments : {
						method : 'GET',
						url : 'amendments/getAmendments',
						isArray : true
					},
					deleteAmendment : {
						method : 'DELETE',
						url : 'amendments/deleteAmendment/:id',
						id : '@id'
					},
					suggestAmendment : {
						method : 'POST',
						url : 'http://localhost:8081/XMLProject/rest/amendments/suggestAmendment/:amendment',
						amendment : '@amendment'
					},
					isArray : false,
					headers : {
						"Content-Type" : "application/xml"
					}
				})
				return Amendments;
			})

}(angular))