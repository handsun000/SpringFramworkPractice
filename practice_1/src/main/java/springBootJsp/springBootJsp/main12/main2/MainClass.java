package springBootJsp.springBootJsp.main12.main2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTXMain12_2.xml");
        AdminConnection adminConnection = ctx.getBean("adminConnection", AdminConnection.class);
        log.info("adminID: " + adminConnection.getAdminId());
        log.info("adminPW: " + adminConnection.getAdminPw());
        log.info("sub_adminID: " + adminConnection.getSub_adminId());
        log.info("sub_adminPW: " + adminConnection.getSub_adminPw());

        ctx.close();
    }
}
