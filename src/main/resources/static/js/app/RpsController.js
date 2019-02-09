'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {

			$scope.rpsDto = {
				userId : null,
				userName : null,
			};

			$scope.handShown = function(choice) {
				RpsService.handShown(choice).then(function() {
					console.log("entered rpcService.handShown("+choice+")");
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