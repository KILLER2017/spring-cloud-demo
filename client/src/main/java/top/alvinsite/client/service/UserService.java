package top.alvinsite.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import top.alvinsite.client.service.fallback.UserServiceFallback;

/**
 * @author Alvin
 * @email 54304634@qq.com
 * @date 2021/1/18 17:31
 */
@FeignClient(value = "USER-SERVICE")
public interface UserService extends top.alvinsite.user.api.service.UserService {
}
