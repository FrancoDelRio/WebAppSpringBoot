package com.webapp.springboot.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControler {
    //Inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/propertiesconf")
    public String propertiesconf(){
        return "Coach:" + coachName + ", Team Name: " + teamName;
    }
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
