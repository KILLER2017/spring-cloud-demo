package top.alvinsite.common.aop;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
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
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import top.alvinsite.common.model.vo.Result;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/20 18:47
 */

public class CommonResultControllerAdviceAdapter implements ResponseBodyAdvice<Object> {

    /**
     * 来实现一个全部controller共享的dataBiner Java代码
     * @param binder 用来绑定请求参数到指定的属性编辑器，可以继承WebBindingInitializer
     */
    @InitBinder
    public void dataBind(WebDataBinder binder) {
        ///注册
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return AbstractJackson2HttpMessageConverter.class.isAssignableFrom(converterType);
    }

    @Override
    @NonNull
    public final Object beforeBodyWrite(@Nullable Object body, MethodParameter returnType,
                                        MediaType contentType, Class<? extends HttpMessageConverter<?>> converterType,
                                        ServerHttpRequest request, ServerHttpResponse response) {
        MappingJacksonValue container = getOrCreateContainer(body);
        // The contain body will never be null
        beforeBodyWriteInternal(container, contentType, returnType, request, response);
        return container;
    }


    /**
     * Wrap the body in a {@link MappingJacksonValue} value container (for providing
     * additional serialization instructions) or simply cast it if already wrapped.
     */
    private MappingJacksonValue getOrCreateContainer(Object body) {
        return body instanceof MappingJacksonValue ? (MappingJacksonValue) body : new MappingJacksonValue(body);
    }

    private void beforeBodyWriteInternal(MappingJacksonValue bodyContainer,
                                         MediaType contentType,
                                         MethodParameter returnType,
                                         ServerHttpRequest request,
                                         ServerHttpResponse response) {
        // Get return body
        Object returnBody = bodyContainer.getValue();

        if (returnBody instanceof Result) {
            // If the return body is instance of BaseResponse
            Result<?> baseResponse = (Result) returnBody;
            response.setStatusCode(HttpStatus.ACCEPTED);
            return;
        }

        // Wrap the return body
        Result<?> baseResponse = Result.success(returnBody);
        bodyContainer.setValue(baseResponse);
        response.setStatusCode(HttpStatus.ACCEPTED);
    }
}
