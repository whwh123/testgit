package aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author WH
 * @date 2020/8/10 17:17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProducStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducStart.class,args);
    }
}
