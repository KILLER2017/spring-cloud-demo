package top.alvinsite.common.exception;

import lombok.Getter;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 16:14
 */
@Getter
public class BaseException extends RuntimeException {
    /**
     * 异常对应的错误类型
     */
    private final StatusCode statusCode;

    /**
     * 默认是系统异常
     */
    public BaseException() {
        this.statusCode = GeneralStatuaCode.SYSTEM_ERROR;
    }

    public BaseException(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public BaseException(StatusCode statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public BaseException(StatusCode statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }
}
