package com.chixsaw.chixdi.controllers;

import com.chixsaw.chixdi.services.GreetingService;

/**
 * Created by Raphael Frey on 25.11.2022
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
