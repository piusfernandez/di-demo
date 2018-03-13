package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		System.out.println("Hello - I am greetingServiceImpl");
		return "hello !!!";
	}

}
