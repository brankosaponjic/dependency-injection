package com.brankosaponjic.dependencyinjection;

import com.brankosaponjic.dependencyinjection.controllers.MyController;
import com.brankosaponjic.dependencyinjection.examplebeans.FakeDataSource;
import com.brankosaponjic.dependencyinjection.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.brankosaponjic.dependencyinjection.services", "com.brankosaponjic.dependencyinjection.controllers",
//		"com.brankosaponjic.dependencyinjection.config", "com.brankosaponjic.dependencyinjection.examplebeans"})
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);

		System.out.println(fakeJmsBroker.getUser());
	}

}
