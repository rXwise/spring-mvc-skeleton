'use strict';

app.factory("UserService", function($resource) {
	return $resource("/users/" + ":action", {}, {
		query: { method: "GET", isArray: true },
		create: { method: "POST" },
		remove: { method: "DELETE" },
		update: { method: "PUT" }
	});
});