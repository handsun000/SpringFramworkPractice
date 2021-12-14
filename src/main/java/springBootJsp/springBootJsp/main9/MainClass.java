package springBootJsp.springBootJsp.main9;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Student student1 = ctx.getBean("student1", Student.class);
        log.info(student1.getName());
        Student student2 = ctx.getBean("student2", Student.class);
        log.info(student2.getName());

        ctx.close();
    }
}
