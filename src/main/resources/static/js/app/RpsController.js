'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {
			$scope.humanMove = function(choice) {
			    $scope.humanChoice={className:choice.toLowerCase()+'-human'};
				RpsService.humanMove(choice).then(function(response) {
					$scope.computersChoice=response.data;
					$scope.computersChoice.className=response.data.choice.toLowerCase() + '-computer';
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);