package com.xpanxion.skeleton.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.xpanxion.skeleton.dto.beans.UserBean;
import com.xpanxion.skeleton.service.UserService;

@Controller
public class RestUserController {

    private UserService userService;
    
    @Autowired
    public RestUserController(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/users")
    @ResponseBody
    public List<UserBean> getAllUsers() {
        return this.userService.getUserBeans();
    }
    
    @RequestMapping("/users/{id}")
    @ResponseBody
    public UserBean getUserById(@PathVariable Long id) {
        return this.userService.getUserById(id);
    }
    
    @RequestMapping(value = "/users/new", method = RequestMethod.POST) 
    public ResponseEntity<Void> saveUser(@RequestBody UserBean user, UriComponentsBuilder builder) {
        this.userService.saveUser(user);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    } 
    
    @RequestMapping(value = "/users/edit", method = RequestMethod.PUT)
    @ResponseBody
    public String saveExistingUser(UserBean user) {
        this.userService.saveUser(user);
        return "Success";
    }
    
    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteUser(@PathVariable Long id) {
        System.out.println("ID is: " + id);
        this.userService.deleteUser(id);
        return "redirect:/";
    }
}
