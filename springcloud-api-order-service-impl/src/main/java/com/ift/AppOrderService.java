package com.ift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liufei
 * @since 2019-10-15 17:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppOrderService {

    public static void main(String[] args) {
        SpringApplication.run(AppOrderService.class, args);
    }
}
