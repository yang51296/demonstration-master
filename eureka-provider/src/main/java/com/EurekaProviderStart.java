package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by hp on 2018/5/18.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderStart.class,args);
    }
}
