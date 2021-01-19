package top.alvinsite.user.api.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.alvinsite.user.api.model.dto.UserDTO;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 18:35
 */
public interface UserService {

    /**
     * 用户登录鉴权
     * @param username
     * @param password
     * @param captcha
     * @return
     */
    @PostMapping(value = "/user/login")
    UserDTO login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("captcha") String captcha);
}
