package com.chixsaw.chixdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World!");

        return "Hi Folks!";
    }
}
