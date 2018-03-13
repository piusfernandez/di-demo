package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.services.GreetingService;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx =	SpringApplication.run(DiDemoApplication.class, args);
	 MyController myController = (MyController)ctx.getBean("myController");
	 myController.hello();
	 ConstructorInjectedController cic = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
	 cic.sayHello();
	 SetterInjectedController sic = (SetterInjectedController)ctx.getBean("setterInjectedController");
	 sic.sayHello();
	 PropertyInjectedController pic = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
	 pic.sayHello();
	 GreetingService greetingService = (GreetingService)ctx.getBean("greetingServiceImpl");
	 greetingService.sayGreeting();
	}
}
