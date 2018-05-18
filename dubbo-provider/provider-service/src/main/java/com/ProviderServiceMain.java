package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/5/4.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping(value = "/api/rest")
@RefreshScope
public class ProviderServiceMain {

    @GetMapping("/name")
    public String getHost() {
        return host +":"+ host;
    }


    @Value("${test.name}")
    String host;


    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceMain.class);
    }
}
