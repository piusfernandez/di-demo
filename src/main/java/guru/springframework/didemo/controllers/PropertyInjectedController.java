package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

public class PropertyInjectedController {
	public GreetingService greetingService;
	
	String sayHello()	{
		return greetingService.sayGreeting();
	}
	
	
}
