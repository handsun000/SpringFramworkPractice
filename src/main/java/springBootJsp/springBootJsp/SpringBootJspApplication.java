package springBootJsp.springBootJsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springBootJsp.springBootJsp.main9.ApplicationConfig;
import springBootJsp.springBootJsp.main9.Student;

@SpringBootApplication
@Slf4j
public class SpringBootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJspApplication.class, args);
	}

}
