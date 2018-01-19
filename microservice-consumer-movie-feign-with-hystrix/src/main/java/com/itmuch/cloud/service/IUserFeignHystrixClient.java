package com.itmuch.cloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itmuch.cloud.entity.User;

/**
 * Created by Richard on 2017/12/28 0028.
 */
@FeignClient(name = "microservice-provider-user",fallback = IUserFeignHystrixClient.HystrixClientFallback.class)
public interface IUserFeignHystrixClient {

    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") String id);

    /**
     * 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类
     放入Feign的接口中，当然也可以单独写一个fallback类。
     * @author eacdy
     */
    @Component
    static class HystrixClientFallback implements IUserFeignHystrixClient {
        private static final Logger LOGGER = LoggerFactory.getLogger
                (HystrixClientFallback.class);
        /**
         * hystrix fallback方法
         * @param id id
         * @return 默认的用户
         */
        @Override
        public User findByIdFeign(String id) {
            HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
            User user = new User();
            user.setId("NONE");
            user.setUsername("DEFAULT USERNAME");
            user.setAge(0);
            return user;
        }
    }
}
