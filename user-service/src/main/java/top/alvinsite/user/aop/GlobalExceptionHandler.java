package top.alvinsite.user.aop;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import top.alvinsite.common.aop.GlobalExceptionHandlerAdapter;
import top.alvinsite.common.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.alvinsite.common.exception.GeneralStatuaCode;
import top.alvinsite.common.model.vo.Result;

/**
 * 全局异常拦截
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 18:38
 */
//@RestControllerAdvice
public class GlobalExceptionHandler extends GlobalExceptionHandlerAdapter {

}
