package springBootJsp.springBootJsp.main12.main1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

@Slf4j
public class MainClass {
    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();

        try {
            propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
            log.info(env.getProperty("admin.id"));
            log.info(env.getProperty("admin.pw"));
        } catch (IOException e) {}

        GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
        gCtx.load("applicationCTXMain12_1.xml");
        gCtx.refresh();

        AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
        log.info("admin ID: " + adminConnection.getAdminId());
        log.info("admin PW: " + adminConnection.getAdminPw());

        gCtx.close();
        ctx.close();
    }
}
