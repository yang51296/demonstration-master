package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by hp on 2018/5/21.
 */
@EnableEurekaClient
@EnableZuulProxy
@RefreshScope
@SpringBootApplication
public class CloudZuulStart {
    public static void main(String[] args) {
        SpringApplication.run(CloudZuulStart.class,args);
    }
}
