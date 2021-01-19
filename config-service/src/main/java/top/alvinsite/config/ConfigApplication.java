package top.alvinsite.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.config.server.support.AbstractScmAccessor;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心应用
 * @author Administrator
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigApplication {
    AbstractScmAccessor abstractScmAccessor;
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
