package com.chixsaw.chixdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by Raphael Frey on 26.11.2022
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
