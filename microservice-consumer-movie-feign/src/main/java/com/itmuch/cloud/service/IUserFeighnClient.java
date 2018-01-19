package com.itmuch.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itmuch.cloud.entity.User;

/**
 * Created by Richard on 2017/12/28 0028.
 */
@FeignClient(name = "microservice-provider-user")
public interface IUserFeighnClient {

    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") String id);
}
