package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author WH
 * @date 2020/8/10 16:21
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudServerStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerStart.class,args);
    }
}
