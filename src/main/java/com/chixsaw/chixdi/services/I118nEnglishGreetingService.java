package com.chixsaw.chixdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Profile("EN")
@Service("i18nService")
public class I118nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
