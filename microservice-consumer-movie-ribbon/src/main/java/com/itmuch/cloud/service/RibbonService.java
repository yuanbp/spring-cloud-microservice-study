package com.itmuch.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.itmuch.cloud.entity.User;

/**
 * Created by Richard on 2017/12/28 0028.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(String id){
        return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
    }
}
