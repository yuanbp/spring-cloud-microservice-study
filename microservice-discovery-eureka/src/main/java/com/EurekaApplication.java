package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Richard on 2017/12/27 0027.
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

//    static {
//        System.setProperty("spring.profiles.active","dev");
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
