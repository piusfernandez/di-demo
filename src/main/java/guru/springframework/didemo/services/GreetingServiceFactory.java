package guru.springframework.didemo.services;

public class GreetingServiceFactory {

	public GreetingService getService(String lang) {
		switch(lang) {
			case "en": 
				return new PrimaryGreetingService();
			case "de":
				return new PrimaryGermanGreetingService();
			case "es":
				return new PrimarySpanishGreetingService();
			default:
				return new PrimaryGreetingService();
		}
	}
}
