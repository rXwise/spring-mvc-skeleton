'use strict';
	
//	angular.module('usersApp').controller('UserController', UserController);
//	
//	function UserController($scope) {
//		
//	}

app.controller('UserController', ['$scope', 'UserService', '$mdDialog', function($scope, UserService, $mdDialog) {
	var self = this;
	self.user = {"id": null, "username": "", "password": ""};
	self.users = [];
	self.selected = null;
	self.header = "Welcome";
	
	self.selectUser = selectUser;
	self.deleteUser = deleteUser;
	self.newUser = newUser;
	self.submit = submit;
	self.reset = reset;
	
	getAllUsers();
	
	function getAllUsers() {
		UserService.query(function(data) {
			self.users = data;
		});
	}
	
	function createUser(user) {
		UserService.create({ action: "new" }, user, function() {
			console.log("Successfully added " + user.username);
			getAllUsers();
		});
	}
	
	function editUser(user) {
		
	}
	
	function deleteUser(uid) {
		console.log("Deleting user: " + uid);
		UserService.remove({ action: uid }, function() {
			console.log("Successfully deleted user");
			getAllUsers();
		});
	}
	
	function selectUser(user) {
		self.selected = angular.isNumber(user) ? $scope.users[user] : user;
		self.header = "User Details";
		console.log("Selected User: " + self.selected.id);
	}
	
	function submit() {
		createUser(self.user);
		reset();
		return "/users/" + self.user.id;
	}
	
	function reset() {
		self.user = {};
		userForm.$setPristine();
	}
	
	function newUser() {
		self.selected = null;
		self.header = "New User";
	}
	
}]);