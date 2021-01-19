package top.alvinsite.user.model.vo;

import lombok.Data;
import top.alvinsite.user.model.entity.User;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 17:13
 */
@Data
public class UserVO extends BaseVO<User, UserVO> {

    private String username;

    private String nickname;

    public static UserVO buildEntity(User user) {
        UserVO vo = new UserVO();
        vo.setUsername(user.getUsername());
        vo.setNickname(user.getNickname());
        return vo;
    }
}
