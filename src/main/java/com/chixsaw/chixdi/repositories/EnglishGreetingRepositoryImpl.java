package com.chixsaw.chixdi.repositories;

/**
 * Created by Raphael Frey on 26.11.2022
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
