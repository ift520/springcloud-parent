package com.ift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liufei
 * @since 2019-10-15 16:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppMemberService {

    public static void main(String[] args) {
        SpringApplication.run(AppMemberService.class, args);
    }
}
