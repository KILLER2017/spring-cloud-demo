package top.alvinsite.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.alvinsite.user.model.entity.Role;

import java.util.List;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 14:58
 */
public interface RoleService extends IService<Role> {

    /**
     * 获取所有角色
     * @return 角色列表
     */
    List<Role> listRole();
}
