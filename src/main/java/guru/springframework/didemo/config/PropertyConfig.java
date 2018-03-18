package guru.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import guru.springframework.didemo.examplebeans.FakeDataSource;
import guru.springframework.didemo.examplebeans.FakeJmsBroker;

/*
 * @PropertySource goes out to the external property and 
 * wires the property to the class fields
 * 
 * PropertySourcePlaceHolderConfigurer is what is going to read
 * the file for us. It goes out and enable us to read the property
 * file using @Value annotations
 * 
 * */

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
		@PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

	@Autowired
	Environment env;
	
	@Value("${guru.username}")
	String username;
	
	@Value("${guru.password}")
	String password;
	
	@Value("${guru.dburl}")
	String url;

	@Value("${guru.jms.username}")
	String jmsUsername;
	
	@Value("${guru.jms.password}")
	String jmsPassword;
	
	@Value("${guru.jms.dburl}")
	String jmsUrl;
	
	// Do we really need PropertySourcePlaceholderConfigurer ? 
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties()	{
		PropertySourcesPlaceholderConfigurer p = new PropertySourcesPlaceholderConfigurer();
		return p;
	}
	
	@Bean
	public FakeDataSource fakeDataSource()	{
		System.out.println("### Environment USERNAME: " + env.getProperty("USERNAME"));
		FakeDataSource fds = new FakeDataSource();
		fds.setUser(username);
		fds.setPassword(password);
		fds.setUrl(url);
		return fds;
/*		return new FakeDataSource(username, password, url);
*/	}
	
	@Bean
	public FakeJmsBroker jmsProperties()	{
		return new FakeJmsBroker(jmsUsername, jmsPassword, jmsUrl);
	}
}
