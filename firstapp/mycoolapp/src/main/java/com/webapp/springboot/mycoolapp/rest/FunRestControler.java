package com.webapp.springboot.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {
    // expose "/" that return "HELLO WORLD"

    @GetMapping("/")
    public String sayHelloWorld(){
        return "HELLO WORLD";
    }
}
