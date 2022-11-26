package com.chixsaw.chixdi.config;

import com.chixsaw.chixdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Raphael Frey on 26.11.2022
 * Most used with 3. Party libs.
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean("i18nService")
    I118nEnglishGreetingService i118nEnglishGreetingService() {
        return new I118nEnglishGreetingService();
    }

    @Profile("DE")
    @Bean
    I18NGermanGreetingService i18nService() {
        return new I18NGermanGreetingService();
    }

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
