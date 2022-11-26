package com.chixsaw.chixdi.services;

/**
 * Created by Raphael Frey on 25.11.2022
 */
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
