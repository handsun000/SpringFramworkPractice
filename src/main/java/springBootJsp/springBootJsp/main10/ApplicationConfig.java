package springBootJsp.springBootJsp.main10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConfig {

    @Bean
    public Student student1() {
        ArrayList<String> hobbys = new ArrayList<>();
        hobbys.add("수영");
        hobbys.add("요리");

        Student student = new Student("홍길동", 20, hobbys);
        student.setHeight(180);
        student.setWeight(80);

        return student;
    }
}
