package com.wxf.springcloudhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class SpringcloudHystrixTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixTurbineApplication.class, args);
    }

}
