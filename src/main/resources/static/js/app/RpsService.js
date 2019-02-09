'use strict'

angular.module('demo.services', []).factory('RpsService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.handShown = function(choice) {
				return $http.post(CONSTANTS.handShown + choice);
			}
			return service;
		} ]);