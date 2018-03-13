package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx =	SpringApplication.run(DiDemoApplication.class, args);
	 MyController myController = (MyController)ctx.getBean("myController");
	 System.out.println(myController.hello());
	 ConstructorInjectedController cic = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
	 System.out.println(cic.sayHello());
	 SetterInjectedController sic = (SetterInjectedController)ctx.getBean("setterInjectedController");
	 System.out.println(sic.sayHello());
	 PropertyInjectedController pic = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
	 System.out.println(pic.sayHello());
	}
}
