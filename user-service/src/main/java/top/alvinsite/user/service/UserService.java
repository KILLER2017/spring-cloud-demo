package top.alvinsite.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.alvinsite.user.model.entity.User;

import java.util.List;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 14:58
 */
public interface UserService extends IService<User> {

    /**
     * 用户登录鉴权
     * @param username 用户名
     * @param password 密码
     * @return 用户
     */
    User authenticate(String username, String password);

    /**
     * 注册用户
     * @param user 用户
     * @return 成功与否
     */
    boolean register(User user);

    /**
     * 获取所有用户
     * @return 用户列表
     */
    List<User> listUser();

    /**
     * 根据用户名查找用户信息
     * @param username 用户名
     * @return 用户
     */
    User getByUsername(String username);

    /**
     * 查找某个角色下的所有用户
     * @param roleId 角色ID
     * @return 用户列表
     */
    List<User> listUserByRole(String roleId);
}
