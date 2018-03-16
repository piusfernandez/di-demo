package guru.springframework.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingConfig {

	@Bean
	public GreetingServiceFactory greetingServiceFactory() {
		return new GreetingServiceFactory();
	}
}
