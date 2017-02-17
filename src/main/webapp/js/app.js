'use strict';

var app = angular.module('usersApp', ["ngMaterial", "ngRoute", "ngResource"]);

app.config(function($routeProvider, $locationProvider) {
	$routeProvider
	.when("/", {
		templateUrl : "/static/welcome.html"
	})
	.when("/users/new", {
		templateUrl : "/static/newUser.html"
	})
	.when("/users/:id", {
		templateUrl : "/static/user.html"
	});
	
	$locationProvider.html5Mode({
		enabled: true,
		requireBase: false
	});
});

app.config(function($mdThemingProvider) {
	$mdThemingProvider.theme('dark-grey').backgroundPalette('grey').dark();
	$mdThemingProvider.theme('dark-purple').backgroundPalette('deep-purple').dark();
	$mdThemingProvider.theme('dark-orange').backgroundPalette('orange').dark();
});