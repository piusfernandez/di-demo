package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController sic;
	
	@Before
	public void setup() {
		sic = new SetterInjectedController();
		sic.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void testGreeting()	{
		assertEquals("hello !!!", sic.sayHello());
	}
}
