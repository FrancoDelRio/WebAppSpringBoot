package com.secondApp.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restControler {

    @GetMapping("/")
    public String mainPage(){
        return "This is the main page!!!";
    }

    @GetMapping("/lucky")
    public String lucky(){
        return "TODAY is your lucky day";
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/customproperties")
    public String customProperties(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }
}
