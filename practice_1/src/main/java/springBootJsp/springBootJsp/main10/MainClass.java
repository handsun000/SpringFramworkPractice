package springBootJsp.springBootJsp.main10;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTXMain10.xml");
        Student student1 = ctx.getBean("student1", Student.class);
        log.info(student1.getName());
        Student student2 = ctx.getBean("student2", Student.class);
        log.info(student2.getName());

        ctx.close();
    }
}
