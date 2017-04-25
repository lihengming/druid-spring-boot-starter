package com.github.lihengming.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * druid-spring-boot-starter 测试例子
 *
 * 1.按需配置application.properties
 * 2.run Application
 * 3.访问http://127.0.0.1:8080/druid
 * 4.访问/user/{id}接口，查看监控效果，如：http://127.0.0.1:8080/user/1
 *
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
