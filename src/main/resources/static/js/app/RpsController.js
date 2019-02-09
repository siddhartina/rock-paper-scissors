'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {

			$scope.rpsDto = {
				userId : null,
				userName : null,
			};

			$scope.handShown = function(choice) {
				RpsService.handShown(choice).then(function(response) {
					console.log("Entered rpcService.handShown("+choice+") -> " + response.data.choice);
					$scope.computersChoice=response.data;
					RpsService.getAllUsers().then(function(value) {
						$scope.allUsers= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.rpsDto = {
						userId : null,
						userName : null,
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);