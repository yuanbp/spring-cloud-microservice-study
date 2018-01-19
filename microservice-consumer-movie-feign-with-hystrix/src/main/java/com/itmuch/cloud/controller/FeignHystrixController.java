package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.service.IUserFeignHystrixClient;

/**
 * Created by Richard on 2017/12/28 0028.
 */
@RestController
public class FeignHystrixController {

    @Autowired
    private IUserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("/feign/{id}")
    public User findByIdFeign(@PathVariable String id){
        return this.userFeignHystrixClient.findByIdFeign(id);
    }
}
