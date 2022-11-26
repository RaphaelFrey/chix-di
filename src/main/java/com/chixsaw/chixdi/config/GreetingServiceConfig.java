package com.chixsaw.chixdi.config;

import com.chixsaw.chixdi.services.ConstructorGreetingService;
import com.chixsaw.chixdi.services.PropertyInjectedGreetingService;
import com.chixsaw.chixdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Raphael Frey on 26.11.2022
 * Most used with 3. Party libs.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

}
