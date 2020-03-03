package neeraj.springframework.sfndi;

import neeraj.springframework.sfndi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"neeraj.services","neeraj.springframework.sfndi"})
public class SfnDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SfnDiApplication.class, args);

		PetController petController = (PetController) applicationContext.getBean("petController");
		System.out.println(petController.bestPetType());

		I18Controller i18Controller = (I18Controller) applicationContext.getBean("i18Controller");
		System.out.println(i18Controller.sayHello());

		MyController myController = (MyController) applicationContext.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");
		SetterInjectionController setterInjectionController = (SetterInjectionController) applicationContext.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreetingServices());

		System.out.println("----------- Constructor");
		ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) applicationContext.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreeting());

	}

}
