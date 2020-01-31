package fr.webservice.club;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClubApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ClubApplication.class);
		app.setAdditionalProfiles("import.sql");
		ConfigurableApplicationContext context = app.run(args);
		System.out.println("http://localhost:8094/club");
	}

}
