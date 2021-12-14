package springBootJsp.springBootJsp.main12.main3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {

    @Value("${admin.id}")
    private String adminId;
    @Value("${admin.pw}")
    private String adminPw;
    @Value("${sub_admin.id}")
    private String sub_adminId;
    @Value("${sub_admin.pw}")
    private String sub_adminPw;

    @Bean
    public static PropertySourcesPlaceholderConfigurer Properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

        Resource[] location = new Resource[2];
        location[0] = new ClassPathResource("admin.properties");
        location[1] = new ClassPathResource("sub_admin.properties");
        configurer.setLocations(location);

        return configurer;
    }

    @Bean
    public AdminConnection adminConfig() {
        AdminConnection adminConnection = new AdminConnection();
        adminConnection.setAdminId(adminId);
        adminConnection.setAdminPw(adminPw);
        adminConnection.setSub_adminId(sub_adminId);
        adminConnection.setSub_adminPw(sub_adminPw);
        return adminConnection;
    }
}
