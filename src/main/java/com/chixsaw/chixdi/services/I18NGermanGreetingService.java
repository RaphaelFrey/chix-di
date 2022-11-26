package com.chixsaw.chixdi.services;


/**
 * Created by Raphael Frey on 25.11.2022
 */
public class I18NGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Welt - DE";
    }
}
