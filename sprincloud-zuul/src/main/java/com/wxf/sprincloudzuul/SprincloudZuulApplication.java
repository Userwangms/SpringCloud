package com.wxf.sprincloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SprincloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprincloudZuulApplication.class, args);
    }

}
