package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.ConstructorGreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController cic;
	
	@Before
	public void setup()	{
		cic = new ConstructorInjectedController(new ConstructorGreetingService());
	}
	
	@Test
	public void testGreeting()	{
		assertEquals("Hello - I am injected by Constructor", cic.sayHello());
	}
}
