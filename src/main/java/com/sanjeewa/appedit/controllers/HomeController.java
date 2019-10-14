package com.sanjeewa.appedit.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/sign-in")
    public int[] signIn(){
        System.out.println("inside");
        int[] arr = {1,2,3,85,714};
        return arr;
    }

}
