package com.chixsaw.chixdi.controllers;

import com.chixsaw.chixdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}
