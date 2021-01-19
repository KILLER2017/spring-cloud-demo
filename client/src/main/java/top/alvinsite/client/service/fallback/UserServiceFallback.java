package top.alvinsite.client.service.fallback;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import top.alvinsite.client.service.UserService;
import top.alvinsite.user.api.model.dto.UserDTO;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 19:07
 */
@Component
public class UserServiceFallback implements UserService {

    @Override
    public UserDTO login(String username, String password, String captcha) {
        return new UserDTO();
    }
}
