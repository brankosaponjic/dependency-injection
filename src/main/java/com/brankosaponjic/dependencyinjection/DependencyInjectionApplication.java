package com.brankosaponjic.dependencyinjection;

import com.brankosaponjic.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String hello = myController.sayHelloToSpring();

		System.out.println(hello);

		System.out.println("_________ Property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController)ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("__________ Setter");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("__________ Constructor");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("___________ Primary Bean");

		PrimaryBeanController primaryBeanController =
				(PrimaryBeanController) ctx.getBean("primaryBeanController");

		System.out.println(primaryBeanController.getGreetings());

		System.out.println("___________ I18nController");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());
	}

}
