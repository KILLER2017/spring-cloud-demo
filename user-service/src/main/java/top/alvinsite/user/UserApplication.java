package top.alvinsite.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.stereotype.Repository;

/**
 * 用户中心应用
 * @author Administrator
 */
@MapperScan(
        // 指定扫描包
        basePackages = {"top.alvinsite.user.dao"},
        // 限定注解
        annotationClass = Repository.class
)
@SpringCloudApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
