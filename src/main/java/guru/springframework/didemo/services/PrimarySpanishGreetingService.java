package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
// we have 2 Primary - blocked from spring view since we annotated with @Profile

public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Servico de Saludo Primario";
	}

}
