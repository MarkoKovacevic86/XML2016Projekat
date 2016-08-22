(function(angular) {
	angular.module('amendmentsResource', [ 'ngResource' ]).factory(
			'Amendments', function($resource) {
				var Amendments = $resource('/', {}, {
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
					addAmendment : {
						method : 'POST',
						url : 'amendments/addAmendment/:amendments',
						amendments : '@amendents'
					}
				})
				return Amendments;
			})

}(angular))