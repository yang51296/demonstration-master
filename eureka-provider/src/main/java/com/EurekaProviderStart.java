package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by hp on 2018/5/18.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient    //开启服务中心客户端
@EnableCircuitBreaker  //开启断路器
public class EurekaProviderStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderStart.class,args);
    }
}
