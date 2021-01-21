package top.alvinsite.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 15:15
 */
@RefreshScope
@Slf4j
@RequestMapping
@RestController
public class TestController {


    @Value("${from}")
    private String from;

    @GetMapping
    public String index() {
        log.info("use test-controller:index");
        return "hello, this is user center" + from;
    }
}
