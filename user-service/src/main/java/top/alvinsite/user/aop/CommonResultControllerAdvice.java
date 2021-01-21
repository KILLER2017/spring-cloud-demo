package top.alvinsite.user.aop;

import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import top.alvinsite.common.aop.CommonResultControllerAdviceAdapter;
import top.alvinsite.common.model.vo.Result;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 18:47
 */
// @ControllerAdvice
public class CommonResultControllerAdvice extends CommonResultControllerAdviceAdapter {
}
