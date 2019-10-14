package com.sanjeewa.appedit.controllers;

import com.sanjeewa.appedit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/sign-in")
    public int[] signIn(){
        System.out.println("inside");
        userService.getAll();
        int[] arr = {1,2,3,85,714};
        return arr;
    }

}
