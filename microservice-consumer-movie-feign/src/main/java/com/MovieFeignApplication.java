package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Richard on 2017/12/28 0028.
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MovieFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieFeignApplication.class,args);
    }
}
