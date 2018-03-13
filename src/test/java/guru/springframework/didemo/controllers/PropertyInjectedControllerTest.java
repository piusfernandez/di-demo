package guru.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController pic;
	
	@Before
	public void setup()	{
		pic = new PropertyInjectedController();
		pic.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testHello()	{
		assertEquals("hello !!!", pic.sayHello());
	}
}
