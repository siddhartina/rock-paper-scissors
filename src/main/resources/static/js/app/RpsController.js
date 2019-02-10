'use strict'

var module = angular.module('demo.controllers', []);
module.controller("RpsController", [ "$scope", "RpsService",
		function($scope, RpsService) {
		    var move = {};

            move.humanMood='mood-tie-human';
            move.humanHand='hand';
            move.computersHand='hand';
            move.computerMood= 'mood-tie-computer';
		    $scope.move = move;

			$scope.humanMove = function(choice) {
			    $scope.move.humanHand=choice.toLowerCase()+'-human';
				RpsService.humanMove(choice).then(function(move) {
					$scope.move.humanMood=move.data.result.toLowerCase() + "-human";
					$scope.move.computersHand=move.data.computersChoice.toLowerCase() + '-computer';
					$scope.move.computersMood=move.data.result.toLowerCase() + "-computer";
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);