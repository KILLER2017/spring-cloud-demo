package top.alvinsite.common.model.param;

/**
 * 抽象表单
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 18:23
 */
public abstract class BaseForm<T> {

    /**
     * 获取实例
     * @return 返回实体类
     */
    public abstract T buildEntity();
}
