package com.chixsaw.chixdi.services;


import com.chixsaw.chixdi.repositories.EnglishGreetingRepository;

/**
 * Created by Raphael Frey on 25.11.2022
 */
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
