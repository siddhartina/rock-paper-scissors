'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {
			$scope.handShown = function(choice) {
			    var humanHand = document.getElementById("human-hand");
			    humanHand.className=choice.toLowerCase()+'-human';
				RpsService.handShown(choice).then(function(response) {
					console.log("Entered rpcService.handShown("+choice+") -> " + response.data.choice);
					$scope.computersChoice=response.data;
					$scope.computersChoice.className=response.data.choice.toLowerCase() + '-computer';
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);