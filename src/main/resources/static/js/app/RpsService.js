'use strict'

angular.module('demo.services', []).factory('RpsService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getAllUsers = function() {
				return $http.get(CONSTANTS.getAllUsers);
			}
			service.handShown = function(rpsDto) {
				return $http.post(CONSTANTS.handShown, rpsDto);
			}
			return service;
		} ]);