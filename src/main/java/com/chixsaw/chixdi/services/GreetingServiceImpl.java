package com.chixsaw.chixdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
