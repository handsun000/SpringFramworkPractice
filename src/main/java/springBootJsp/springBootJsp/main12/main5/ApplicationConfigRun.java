package springBootJsp.springBootJsp.main12.main5;

import org.apache.catalina.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {

    @Bean
    public ServerInfo serverInfo() {
        ServerInfo serverInfo = new ServerInfo();
        serverInfo.setIpNum("125.0.0.1");
        serverInfo.setPortNum("80");
        return serverInfo;
    }
}
