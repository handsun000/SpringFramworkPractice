package springBootJsp.springBootJsp.main7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String configLocation = "classpath:applicationCTXMain7.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();

        ctx.close();
    }
}
