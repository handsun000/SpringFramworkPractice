package springBootJsp.springBootJsp.main8;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        String configLocation1 = "classpath:applicationCTXMain8_1.xml";
        String configLocation2 = "classpath:applicationCTXMain8_2.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);
        Student student1 = ctx.getBean("student1", Student.class);
        log.info(student1.getName());
        log.info(String.valueOf(student1.getHobbys()));

        StudentInfo studentInfo1 = ctx.getBean("studentInfo1", StudentInfo.class);
        Student student2 = studentInfo1.getStudent();
        log.info(student2.getName());
        log.info(String.valueOf(student2.getHobbys()));

        if (student1.equals(student2)) {
            log.info("student1 == student2");
        }

        Student student3 = ctx.getBean("student3", Student.class);
        log.info(student3.getName());

        if (student1.equals(student3)) {
            log.info("student1 == student3");
        } else {
            log.info("student1 != student3");
        }

        Family family = ctx.getBean("family", Family.class);
        log.info(family.getPapaName());
        log.info(family.getMamaName());
        log.info(family.getSisterName());
        log.info(family.getBrotherName());
    }
}
