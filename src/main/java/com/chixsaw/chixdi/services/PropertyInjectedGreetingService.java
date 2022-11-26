package com.chixsaw.chixdi.services;

/**
 * Created by Raphael Frey on 25.11.2022
 */
public class PropertyInjectedGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
