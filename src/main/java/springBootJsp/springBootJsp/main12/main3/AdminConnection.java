package springBootJsp.springBootJsp.main12.main3;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
public class AdminConnection implements InitializingBean, DisposableBean {

    private String adminId;
    private String adminPw;
    private String sub_adminId;
    private String sub_adminPw;

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
