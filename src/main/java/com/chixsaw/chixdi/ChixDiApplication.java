package com.chixsaw.chixdi;

import com.chixsaw.chixdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChixDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ChixDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}