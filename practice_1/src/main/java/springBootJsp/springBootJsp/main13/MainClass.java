package springBootJsp.springBootJsp.main13;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTXMain13.xml");

        Student student = ctx.getBean("student", Student.class);
        student.getStudentInfo();

        Worker worker = ctx.getBean("worker", Worker.class);
        worker.getWorkerInfo();

        ctx.close();
    }
}
