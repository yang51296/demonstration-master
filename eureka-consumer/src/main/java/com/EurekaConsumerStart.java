package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by hp on 2018/5/18.
 */
//@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class EurekaConsumerStart {


    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerStart.class,args);
    }
}
//@EnableDiscoveryClient :启用服务注册与发现
//@EnableFeignClients：启用feign进行远程调用