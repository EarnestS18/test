package nz.ac.op.cs.SpringDBPrj;

import nz.ac.op.cs.SpringDBPrj.db.QuizUserRepository;
import nz.ac.op.cs.SpringDBPrj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDbPrjApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();

	}



	public static void main(String[] args) {
		SpringApplication.run(SpringDbPrjApplication.class, args);
	}

}
