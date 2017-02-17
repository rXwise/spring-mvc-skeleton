//package com.xpanxion.skeleton.controllers;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.xpanxion.skeleton.dto.beans.UserBean;
//import com.xpanxion.skeleton.service.UserService;
//
///**
// * Controller for the User Page.
// *
// * @author bobby
// *
// */
//@Controller
//public class UserController {
//
//    private UserService userService;
//    
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public ModelAndView showUserForm() {
//        return new ModelAndView("user", "user", new UserBean());
//    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    public void submit(@ModelAttribute("user")UserBean user) {
//        System.out.println("Adding User: " + user.getUsername());
//        this.userService.addUser(user);
//        //return "user";
//    }
//
//    /**
//     * The default controller action for the user page.
//     *
//     * @return the Model and View for the user page.
//     */
//    @RequestMapping("**/userList")
//    public ModelAndView getUserPage() {
//        ModelAndView mAndV = new ModelAndView("userList");
//        mAndV.addObject("user", this.userService.getUserBeans());
//        return mAndV;
//    }
//
//    /**
//     * Sets the service for this controller
//     *
//     * @param service
//     *            the service to use in this controller.
//     */
//    @Resource
//    public void setUserService(UserService service) {
//        this.userService = service;
//    }
//
//}
