package top.alvinsite.client.aop;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.alvinsite.common.aop.GlobalExceptionHandlerAdapter;
import top.alvinsite.common.exception.GeneralStatuaCode;
import top.alvinsite.common.model.vo.Result;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 19:12
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends GlobalExceptionHandlerAdapter {

    @ExceptionHandler(value = {FeignException.class})
    public Result feignException(FeignException e) {
        log.error("FeignException:", e);
        return Result.fail(GeneralStatuaCode.C0001, e.getMessage());
    }
}
