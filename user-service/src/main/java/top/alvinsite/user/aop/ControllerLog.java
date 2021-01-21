package top.alvinsite.user.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import top.alvinsite.common.aop.ControllerLogAdapter;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/21 10:03
 */
@Aspect
@Component
public class ControllerLog extends ControllerLogAdapter {
}
