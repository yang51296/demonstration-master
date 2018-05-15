package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created  hp on 2018/5/14.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class,args);
    }
}
