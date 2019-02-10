'use strict'

angular.module('demo.services', []).factory('RpsService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.humanMove = function(choice) {
				return $http.post(CONSTANTS.humanMove + choice);
			}
			return service;
		} ]);