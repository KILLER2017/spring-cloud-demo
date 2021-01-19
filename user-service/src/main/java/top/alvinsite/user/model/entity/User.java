package top.alvinsite.user.model.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户类
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 14:49
 */
@Data
public class User {

    private String id;

    private String username;

    private String nickname;

    private String password;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
