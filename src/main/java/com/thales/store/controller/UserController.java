package com.thales.store.controller;

import com.thales.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/users/{userId}", method= RequestMethod.GET)
    public String getOneById(@PathVariable("userId") int userId){
        return userService.findOneById(userId);
    }

    @RequestMapping(value="/users", method= RequestMethod.GET)
    public String getAllById(){
        return userService.findAll();
    }
}
