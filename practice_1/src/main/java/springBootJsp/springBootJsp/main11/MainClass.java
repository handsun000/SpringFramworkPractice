package springBootJsp.springBootJsp.main11;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTXMain11.xml");
        Student student1 = ctx.getBean("student", Student.class);
        log.info(student1.getName());
        log.info(String.valueOf(student1.getAge()));

        Student student2 = ctx.getBean("student", Student.class);
        student2.setName("홍길자");
        student2.setAge(20);
        log.info(student2.getName());
        log.info(String.valueOf(student2.getAge()));

        if (student1.equals(student2)) {
            log.info("student1 == student2");
        } else log.info("student1 != student2");

    }
}
