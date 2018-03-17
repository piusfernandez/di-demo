package guru.springframework.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingConfig {

	@Bean
	public GreetingServiceFactory greetingServiceFactory() {
		return new GreetingServiceFactory();
	}
	
	@Bean
	@Primary
	@Profile({"en", "default"})
	public GreetingService greetingServicePrimary(GreetingServiceFactory greetingServiceFactory)	{
		return greetingServiceFactory.getService("en");
	}
	
	@Bean
	@Primary
	@Profile("de")
	public GreetingService greetingServiceGerman(GreetingServiceFactory greetingServiceFactory)	{
		return greetingServiceFactory.getService("de");
	}
	
	@Bean
	@Primary
	@Profile("es")
	public GreetingService greetingServiceSpanish(GreetingServiceFactory greetingServiceFactory)	{
		return greetingServiceFactory.getService("es");
	}
}
