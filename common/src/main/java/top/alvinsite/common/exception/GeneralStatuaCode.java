package top.alvinsite.common.exception;

import lombok.Getter;

/**
 * 通用错误类型枚举
 * @author Administrator
 */

@Getter
public enum GeneralStatuaCode implements StatusCode {

    /**
     * 全部正常，但不得不填充错误码时返回五个零
     */
    SUCCESS("00000", "一切OK"),

    A0001("A0001", "用户端错误"),
    A0100("A0100", "用户注册错误"),
    A0200("A0200", "用户登录异常"),
    A0230("A0230", "用户登录已过期"),
    A0240("A0240", "用户验证码错误"),
    A0300("A0300", "用户访问权限异常"),
    A0400("A0400", "用户请求参数错误"),
    A0500("A0500", "用户请求服务异常"),
    A0600("A0600", "用户资源异常"),
    A0700("A0700", "用户上传文件异常"),
    A0800("A0800", "用户当前版本异常"),
    A0900("A0900", "用户隐私未授权"),
    A1000("A1000", "用户设备异常"),

    B0001("B0001", "系统执行出错"),
    B0100("B0100", "系统执行超时"),
    B0200("B0200", "系统容灾功能被触发"),
    B0300("B0300", "系统资源耗尽"),

    C0001("C0001", "调用第三方服务出错"),
    C0100("C0100", "中间件服务出错"),
    C0200("C0200", "第三方系统执行超时"),
    C0300("C0300", "数据库服务出错"),
    C0400("C0400", "第三方容灾系统被触发"),
    C0500("C0500", "通知服务出错"),
    C0113("C0113", "接口不存在"),



    SYSTEM_ERROR("-1", "系统异常"),

    SYSTEM_BUSY("000001", "系统繁忙,请稍候再试"),

    GATEWAY_NOT_FOUND_SERVICE("010404", "服务未找到"),

    GATEWAY_ERROR("010500", "网关异常"),

    GATEWAY_CONNECT_TIME_OUT("010002", "网关超时"),

    ARGUMENT_NOT_VALID("020000", "请求参数校验不通过"),

    INVALID_TOKEN("020001", "无效token"),

    UPLOAD_FILE_SIZE_LIMIT("020010", "上传文件大小超过限制"),

    DUPLICATE_PRIMARY_KEY("030000","唯一键冲突");

    /**
     * 错误类型码
     */
    private String code;

    /**
     * 错误类型描述信息
     */
    private String message;

    GeneralStatuaCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
