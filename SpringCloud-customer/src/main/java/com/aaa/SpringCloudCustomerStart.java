package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WH
 * @date 2020/8/10 19:58
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudCustomerStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCustomerStart.class,args);
    }

}
