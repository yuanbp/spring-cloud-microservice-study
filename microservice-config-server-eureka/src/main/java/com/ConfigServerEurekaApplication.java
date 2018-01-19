package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ------------------------------------------------------
 * |                                                    |
 * |                       _oo0oo_                      |
 * |                      o8888888o                     |
 * |                      88" . "88                     |
 * |                      (| -_- |)                     |
 * |                      0\  =  /0                     |
 * |                    ___/`---'\___                   |
 * |                  .' \\|     |// '.                 |
 * |                 / \\|||  :  |||// \                |
 * |                / _||||| -:- |||||- \               |
 * |               |   | \\\  -  /// |   |              |
 * |               | \_|  ''\---/''  |_/ |              |
 * |               \  .-\__  '-'  ___/-. /              |
 * |             ___'. .'  /--.--\  `. .'___            |
 * |          ."" '<  `.___\_<|>_/___.' >' "".          |
 * |         | | :  `- \`.;`\ _ /`;.`/ - ` : | |        |
 * |         \  \ `_.   \_ __\ /__ _/   .-` /  /        |
 * |     =====`-.____`.___ \_____/___.-`___.-'=====     |
 * |                       `=---='                      |
 * |                                                    |
 * |     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    |
 * |                                                    |
 * |               佛祖保佑         永无BUG               |
 * |                                                    |
 * ------------------------------------------------------
 * <p>
 * com [workspace_idea_01]
 * Created by Richard on 2018/01/08 0008
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEurekaApplication.class,args);
    }
}
