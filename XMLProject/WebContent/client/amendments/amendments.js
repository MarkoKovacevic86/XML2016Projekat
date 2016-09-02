(function(angular) {

	angular.module('amendments', [ 'amendmentsResource' ]).controller(
			'amendmentsCtrl', function($scope, Amendments) {

				$scope.amendments = {};

				$scope.uploadAmendment = function() {
					var file = document.getElementById('file').files[0];
					console.log(file);
					var fileReader = new FileReader();
					fileReader.onloadend = function(e) {
						console.log("Usao odje ???")
						var data = e.target.result;
						Amendments.suggestAmendment({
							amendment : data
						});
					}
					fileReader.readAsBinaryString(file);
				}

			})

}(angular))