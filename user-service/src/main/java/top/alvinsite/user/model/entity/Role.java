package top.alvinsite.user.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 角色类
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 14:49
 */
@Data
public class Role {

    private String id;

    private String name;

    private String alias;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
