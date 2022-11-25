package com.chixsaw.chixdi;

import com.chixsaw.chixdi.controllers.ConstructorInjectedController;
import com.chixsaw.chixdi.controllers.MyController;
import com.chixsaw.chixdi.controllers.PropertyInjectedController;
import com.chixsaw.chixdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChixDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ChixDiApplication.class, args);

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
	}

}
