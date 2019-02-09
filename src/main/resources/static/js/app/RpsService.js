'use strict'

angular.module('demo.services', []).factory('RpsService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getAllUsers = function() {
				return $http.get(CONSTANTS.getAllUsers);
			}
			service.saveUser = function(rpsDto) {
				return $http.post(CONSTANTS.saveUser, rpsDto);
			}
			return service;
		} ]);