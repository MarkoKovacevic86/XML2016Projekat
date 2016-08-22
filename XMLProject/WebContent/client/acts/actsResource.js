(function(angular) {
	angular.module('actsResource', [ 'ngResource' ]).factory('Acts',
			function($resource) {
				var Acts = $resource('/acts', {}, {
					getActs : {
						method : 'GET',
						url : 'acts/getActs',
						isArray:true
					},
					deleteAct :{
						method :'DELETE',
						url : 'acts/deleteAct/:id',
						id : '@id'
					},
					getById: {
						method:'GET',
						url : 'acts/:id',
						id : '@id'
						
					},
					addAct : {
						method: 'POST',
						url : 'acts/addAct/:act',
						act : '@act'
					}
				})
				
				return Acts;
			})

}(angular))
