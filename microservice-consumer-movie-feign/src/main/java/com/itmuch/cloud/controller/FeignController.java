package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.service.IUserFeighnClient;

/**
 * Created by Richard on 2017/12/28 0028.
 */
@RestController
public class FeignController {

    @Autowired
    private IUserFeighnClient userFeighnClient;

    @GetMapping("/feign/{id}")
    public User findByIdFeign(@PathVariable String id){
        return this.userFeighnClient.findByIdFeign(id);
    }
}
