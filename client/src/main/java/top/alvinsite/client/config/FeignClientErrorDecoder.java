package top.alvinsite.client.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpStatus;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/21 10:24
 */
@Slf4j
@Configuration
public class FeignClientErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        if (response.status() != HttpStatus.SC_OK) {
            String errorContent;

        }
        return null;
    }
}
