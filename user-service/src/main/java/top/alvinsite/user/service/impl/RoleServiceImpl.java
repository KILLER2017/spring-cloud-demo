package top.alvinsite.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.alvinsite.user.dao.RoleMapper;
import top.alvinsite.user.model.entity.Role;
import top.alvinsite.user.service.RoleService;

import java.util.List;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 15:14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Override
    public List<Role> listRole() {
        return null;
    }
}
