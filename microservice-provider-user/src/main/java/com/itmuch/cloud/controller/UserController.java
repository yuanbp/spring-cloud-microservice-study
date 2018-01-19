package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.service.IUserService;

/**
 * Created by Richard on 2017/12/27 0027.
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable String id){
        User findOne = userService.selectByPrimaryKey(id);
        return findOne;
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

    @GetMapping("/info")
    public ServiceInstance info(){
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }
}
