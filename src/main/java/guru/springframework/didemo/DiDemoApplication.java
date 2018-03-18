package guru.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.didemo.controllers.ConstructorInjectedController;
import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.PropertyInjectedController;
import guru.springframework.didemo.controllers.SetterInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;
import guru.springframework.didemo.services.GreetingServiceFactory;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
	 ApplicationContext ctx =	SpringApplication.run(DiDemoApplication.class, args);
	 MyController myController = (MyController)ctx.getBean("myController");
	 System.out.println(myController.hello());
	 
/*	 ConstructorInjectedController cic = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
	 System.out.println(cic.sayHello());
	 SetterInjectedController sic = (SetterInjectedController)ctx.getBean("setterInjectedController");
	 System.out.println(sic.sayHello());
	 PropertyInjectedController pic = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
	 System.out.println(pic.sayHello());
	 
	 System.out.println("-------------------------");
	 GreetingServiceFactory greetingServiceFactory = (GreetingServiceFactory)ctx.getBean("greetingServiceFactory");
	 System.out.println(greetingServiceFactory.getService("es").sayGreeting());
*/	
	 FakeDataSource fds = (FakeDataSource) ctx.getBean(FakeDataSource.class);
	 System.out.println(fds);
	 
	 FakeJmsBroker jms = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
	 System.out.println(jms);
	 
	}
}
