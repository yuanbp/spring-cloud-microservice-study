package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

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
@EnableZuulProxy
public class ZuulApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApiGatewayApplication.class,args);
    }
}
