package com.frexdel.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/b")
public class testController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World !!!";
    }

}