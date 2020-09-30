package com.brankosaponjic.dependencyinjection;

import com.brankosaponjic.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"newpackage.services", "com.brankosaponjic.dependencyinjection.controllers"})
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String hello = myController.sayHelloToSpring();

		System.out.println(hello);
	}

}
