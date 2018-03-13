package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		System.out.println("Hello - I am injected by Setter");
		return "Hello - I am injected by Setter";
	}

}
