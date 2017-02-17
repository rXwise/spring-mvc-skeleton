package com.xpanxion.skeleton.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for the Index Page.
 * 
 * @author bobby
 * 
 */
@Controller
@RequestMapping("/")
public class MainController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }
}
