package top.alvinsite.user.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.alvinsite.user.dao.UserMapper;
import top.alvinsite.user.model.entity.User;
import top.alvinsite.user.service.UserService;

import java.util.List;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 15:12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User authenticate(String username, String password) {
        return getOne(Wrappers.<User>lambdaQuery().eq(User::getUsername, username).eq(User::getPassword, password), false);
    }

    @Override
    public boolean register(User user) {
        return false;
    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public List<User> listUserByRole(String roleId) {
        return null;
    }

}
