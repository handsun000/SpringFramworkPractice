package springBootJsp.springBootJsp.main5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        String configLocation = "classpath:applicationCTXMain5.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);

        myInfo.getInfo();
        ctx.close();
    }
}
