package top.alvinsite.client.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.alvinsite.client.service.UserService;
import top.alvinsite.common.exception.BaseException;
import top.alvinsite.common.exception.GeneralStatuaCode;
import top.alvinsite.user.api.model.dto.UserDTO;

import java.util.Optional;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 11:16
 */
@RequestMapping("test")
@RestController
@AllArgsConstructor
public class TestController {

    private final UserService userService;

    @GetMapping
    public String index() {
        return "hello, this is client api";
    }

    @PostMapping("login")
    public UserDTO login(String username, String password, String captcha) {
        if (!"123456".equals(captcha)) {
            throw new BaseException(GeneralStatuaCode.A0240);
        }

        UserDTO userDTO = userService.login(username, password, captcha);
        if (userDTO == null) {
            throw new BaseException(GeneralStatuaCode.A0200, "用户名或密码错误");
        }
        return userDTO;
    }
}
