package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// getting a handle/hold of Application Context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// now we can ask from the context for an instance of MyController
		// we need to cast, because it just returns an object
		// by default, string name of the bean is the class name, but beginning with a lower case letter
		MyController myController = (MyController)ctx.getBean("myController");

//		System.out.println("---------Primary Bean");
//
//		System.out.println(myController.sayHello());
//
//		System.out.println("---------Property");
//
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//
//		System.out.println("---------Setter");
//
//		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//
//		System.out.println("---------Constructor");
//
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());
//
//		System.out.println("---------I18Controller");
//
//		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//		System.out.println(i18nController.sayHello());

		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
	}

}
