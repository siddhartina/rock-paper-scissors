'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {

			$scope.rpsDto = {
				userId : null,
				userName : null,
				skillDtos : []
			};
			$scope.skills = [];
			
			$scope.handShown = function() {
				$scope.rpsDto.skillDtos = $scope.skills.map(skill => {
					return {skillId: null, skillName: skill};
				});
				RpsService.handShown($scope.rpsDto).then(function() {
					console.log("entered rpcService.handShown()");
					RpsService.getAllUsers().then(function(value) {
						$scope.allUsers= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});

					$scope.skills = [];
					$scope.rpsDto = {
						userId : null,
						userName : null,
						skillDtos : []
					};
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);