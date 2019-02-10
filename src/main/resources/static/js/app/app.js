'use strict'

var rpsApp = angular.module('rps', [
    'ui.bootstrap',
    'rps.controllers',
    'rps.services'
]);

rpsApp.constant("CONSTANTS", {
	humanMove : "/rps/humanChoice?choice="
});