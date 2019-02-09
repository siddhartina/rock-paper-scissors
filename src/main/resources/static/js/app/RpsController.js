'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {
			$scope.handShown = function(choice) {
				RpsService.handShown(choice).then(function(response) {
					console.log("Entered rpcService.handShown("+choice+") -> " + response.data.choice);
					$scope.computersChoice=response.data;
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);