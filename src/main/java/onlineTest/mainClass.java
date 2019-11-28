package onlineTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class mainClass {

public static void main(String[] args) {
		
		SpringApplication.run(mainClass.class, args);
		// TODO Auto-generated method stub

	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(mainClass.class);
	}

}
