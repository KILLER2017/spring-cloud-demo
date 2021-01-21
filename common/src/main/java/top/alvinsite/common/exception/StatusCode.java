package top.alvinsite.common.exception;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 16:15
 */
public interface StatusCode {

    /**
     * 返回错误代码
     * @return 错误代码
     */
    String getCode();

    /**
     * 返回错误提示信息
     * @return 提示信息
     */
    String getMessage();
}
