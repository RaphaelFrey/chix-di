package com.chixsaw.chixdi;

import com.chixsaw.chixdi.config.ChixConfiguration;
import com.chixsaw.chixdi.config.ChixConstructorConfig;
import com.chixsaw.chixdi.controllers.*;
import com.chixsaw.chixdi.datasource.FakeDataSource;
import com.chixsaw.chixdi.services.PrototypeBean;
import com.chixsaw.chixdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.chixsaw.chixdi", "com.springframework.pets"})
@SpringBootApplication
public class ChixDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ChixDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("---------------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("-------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("-------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("-------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("----- Bean Scope -----");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());

		System.out.println("--------- Config Props Bean");
		ChixConfiguration chixConfiguration = ctx.getBean(ChixConfiguration.class);
		System.out.println(chixConfiguration.getUsername());
		System.out.println(chixConfiguration.getPassword());
		System.out.println(chixConfiguration.getJdbcUrl());

		System.out.println("------------ Constructor Binding");
		ChixConstructorConfig chixConstructorConfig = ctx.getBean(ChixConstructorConfig.class);
		System.out.println(chixConstructorConfig.getUsername());
		System.out.println(chixConstructorConfig.getPassword());
		System.out.println(chixConstructorConfig.getJdbcUrl());
	}

}
