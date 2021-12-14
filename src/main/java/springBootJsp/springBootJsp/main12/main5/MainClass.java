package springBootJsp.springBootJsp.main12.main5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

@Slf4j
public class MainClass {
    public static void main(String[] args) {

        String config = null;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (str.equals("dev")) {
            config = str;
        } else if (str.equals("run")) {
            config = str;
        }

        scanner.close();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles(config);
        ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
        ctx.refresh();

        ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
        log.info("IP: " + serverInfo.getIpNum());
        log.info("PORT: " + serverInfo.getPortNum());

        ctx.close();
    }
}
