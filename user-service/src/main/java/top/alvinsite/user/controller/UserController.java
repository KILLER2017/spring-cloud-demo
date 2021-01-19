package top.alvinsite.user.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.alvinsite.user.api.model.dto.UserDTO;
import top.alvinsite.user.model.vo.UserVO;
import top.alvinsite.user.service.UserService;

import java.util.Optional;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 15:25
 */
@Slf4j
@RestController
@AllArgsConstructor
public class UserController implements top.alvinsite.user.api.service.UserService {

    private final static String CAPTCHA = "123456";

    private final UserService userService;

    /**
     * 登录用户鉴权
     * @param username 用户名
     * @param password 密码
     * @param captcha 验证码
     */
    @Override
    @RequestMapping("login")
    public UserDTO login(String username, String password, String captcha) {
        if (!CAPTCHA.equals(captcha)) {
            throw new IllegalArgumentException("验证码错误");
        }

        return Optional.ofNullable(userService.authenticate(username, password))
                .map(item -> {
                    UserDTO userDTO = new UserDTO();
                    userDTO.setUsername(item.getUsername());
                    userDTO.setNickname(item.getNickname());
                    return userDTO;
                })
                .orElseThrow(() -> new IllegalArgumentException("用户名密码错误"));
    }
}
