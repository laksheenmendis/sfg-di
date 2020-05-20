package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// getting a handle/ hold of Application Context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// now we can ask from the context for an instance of MyController
		// we need to cast, because it just returns an object
		// by default, string name of the bean is the class name, but beginning with a lower case letter
		MyController myController = (MyController)ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
