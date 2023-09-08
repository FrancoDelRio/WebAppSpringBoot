package com.webapp.springboot.mycoolapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {
    // expose "/" that return "HELLO WORLD"

    @GetMapping("/")
    public String sayHelloWorld(){
        return "SISISI";
    }


    // new endpoint "otracosa"
    @GetMapping("/otracosa")
    public String otracosa(){
        return "run very fast";
    }

    // new endpoint "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today you're lucky";
    }
}
