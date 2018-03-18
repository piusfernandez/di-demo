package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.GreetingServiceImpl;
import guru.springframework.didemo.services.SetterGreetingService;

public class SetterInjectedControllerTest {

	private SetterInjectedController sic;
	
	@Before
	public void setup() {
		sic = new SetterInjectedController();
		sic.setGreetingService(new SetterGreetingService());
	}
	
	@Test
	public void testGreeting()	{
		assertEquals("Hello - I am injected by Setter", sic.sayHello());
	}
}
