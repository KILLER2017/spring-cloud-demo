package top.alvinsite.common.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import top.alvinsite.common.exception.BaseException;
import top.alvinsite.common.exception.StatusCode;
import top.alvinsite.common.exception.GeneralStatuaCode;


import java.time.Instant;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 16:12
 */
@Getter
@Builder
public class Result<T> {
    public static final String SUCCESSFUL_CODE = "000000";
    public static final String SUCCESSFUL_MSG = "处理成功";

    private final String code;

    private final String message;

    private final String cause;

    private final Instant time = Instant.now();

    // @JsonInclude(JsonInclude.Include.NON_NULL)
    private final T data;

    public Result(String code, String message, String cause, T data) {
        this.code = code;
        this.message = message;
        this.cause = cause;
        this.data = data;
    }

    public Result(String code, String message, T data) {
        this(code, message, "", data);
    }

    public Result(StatusCode statusCode, String cause, T data) {
        this(statusCode.getCode(), statusCode.getMessage(), cause, data);
    }

    public Result(StatusCode statusCode, T data) {
        this(statusCode, "", data);
    }

    public Result(StatusCode statusCode) {
        this(statusCode, (T) null);
    }

    public static <T> Result success(StatusCode statusCode, T data) {
        return Result.builder()
                .code(statusCode.getCode())
                .message(statusCode.getMessage())
                .data(data)
                .build();
    }

    public static Result success() {
        return Result.builder()
                .code(GeneralStatuaCode.SUCCESS.getCode())
                .message(GeneralStatuaCode.SUCCESS.getMessage())
                .build();
    }

    public static <T> Result success(T data) {
        return success(GeneralStatuaCode.SUCCESS, data);
    }


    public static <T> Result<T> success(StatusCode statusCode, String message, T data) {
        return new Result<T>(statusCode, message, data);
    }

    public static Result fail() {
        return new Result(GeneralStatuaCode.B0001);
    }

    public static Result fail(StatusCode statusCode) {
        return new Result<>(statusCode);
    }

    public static Result fail(StatusCode statusCode, String cause) {
        return new Result(statusCode, cause, null);
    }

    public static <T> Result<T> fail(StatusCode statusCode, String cause, T data) {
        return new Result<T>(statusCode, cause, data);
    }

    /**
     * 系统异常类并返回结果数据
     *
     * @param data
     * @return Result
     */
    public static Result fail(BaseException exception, Object data) {
        return new Result<>(exception.getStatusCode(), exception.getMessage(), data);
    }

    public static Result fail(BaseException exception) {
        return new Result<>(exception.getStatusCode(), exception.getMessage(), null);
    }

    /**
     * 成功code=000000
     * @return true/false
     */
    @JsonIgnore
    public boolean isSuccess() {
        return GeneralStatuaCode.SUCCESS.getCode().equals(this.code);
    }

    /**
     * 失败
     * @return true/false
     */
    @JsonIgnore
    public boolean isFail() {
        return !isSuccess();
    }
}
