package top.alvinsite.common.aop;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import top.alvinsite.common.exception.BaseException;
import top.alvinsite.common.exception.GeneralStatuaCode;
import top.alvinsite.common.model.vo.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常拦截
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 18:38
 */
@Slf4j
public class GlobalExceptionHandlerAdapter {
    /**
     * 自定义异常
     */
    @ExceptionHandler(value = BaseException.class)
    public Result processException(BaseException e) {
        return Result.fail(e);
    }

    /***
     * 404处理
     * @param e 异常
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Result notFountHandler(HttpServletRequest request, NoHandlerFoundException e){
        String method = request.getMethod();
        String path = request.getRequestURI();
        Map<String,Object> data = new HashMap<>(4);
        data.put("method", method);
        data.put("path", path);
        return Result.fail(GeneralStatuaCode.C0113, e.getMessage(), data);
    }

    /**
     * 请求方法不支持
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result handleHttpRequestMethodNotSupportedException(Exception e) {
        return Result.fail(GeneralStatuaCode.C0113, e.getMessage());
    }

    /**
     * 通用异常
     */
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        e.printStackTrace();
        return Result.fail(GeneralStatuaCode.B0001, e.getMessage());
    }
}
