package springBootJsp.springBootJsp.main12.main1;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

@Data
@Slf4j
public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

    private Environment env;
    private String adminId;
    private String adminPw;


    @Override
    public void setEnvironment(Environment env) {
        log.info("setEnvironment()");
        setEnv(env);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet()");

        setAdminId(env.getProperty("admin.id"));
        setAdminPw(env.getProperty("admin.pw"));
    }

    @Override
    public void destroy() throws Exception {
        log.info("destroy()");
    }
}
