package com.chixsaw.chixdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Raphael Frey on 26.11.2022
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Creating a Prototype Bean!!!!!!!!!!!!!!!!!!!!");
    }

    public String getMyScope() {
        return "I'm a Prototype";
    }
}
