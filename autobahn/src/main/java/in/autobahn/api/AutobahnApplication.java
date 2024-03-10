package in.autobahn.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "in.autobahn.repo")
@EntityScan(basePackages = "in.autobahn.core.entities")
@ComponentScan(basePackages = "in.autobahn.api")
@ComponentScan(basePackages = "in.autobahn.service")
public class AutobahnApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutobahnApplication.class, args);
	}

}
