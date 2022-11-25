package com.chixsaw.chixdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Raphael Frey on 25.11.2022
 */
@Profile("DE")
@Service("i18nService")
public class I18NGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Welt - DE";
    }
}
