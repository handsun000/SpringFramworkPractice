package springBootJsp.springBootJsp.main12.main3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        AdminConnection adminConfig = ctx.getBean("adminConfig", AdminConnection.class);

        log.info("adminID: " + adminConfig.getAdminId());
        log.info("adminPW: " + adminConfig.getAdminPw());
        log.info("sub_adminID: " + adminConfig.getSub_adminId());
        log.info("sub_adminPW: " + adminConfig.getSub_adminPw());

        ctx.close();
    }
}
