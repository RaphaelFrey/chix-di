package com.chixsaw.chixdi.config;

import com.chixsaw.chixdi.datasource.FakeDataSource;
import com.chixsaw.chixdi.repositories.EnglishGreetingRepository;
import com.chixsaw.chixdi.repositories.EnglishGreetingRepositoryImpl;
import com.chixsaw.chixdi.services.*;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * Created by Raphael Frey on 26.11.2022
 * Most used with 3. Party libs.
 */
@EnableConfigurationProperties(ChixConstructorConfig.class)
@ImportResource("classpath:chixdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(ChixConstructorConfig chixConstructorConfig) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(chixConstructorConfig.getUsername());
        fakeDataSource.setPassword(chixConstructorConfig.getPassword());
        fakeDataSource.setJdbcUrl(chixConstructorConfig.getJdbcUrl());
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    @Primary
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile("DE")
    @Bean
    I18nGermanGreetingService i18nService() {
        return new I18nGermanGreetingService();
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
