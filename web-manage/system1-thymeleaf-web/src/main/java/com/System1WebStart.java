package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/6/7.
 */
@SpringBootApplication
@EnableDiscoveryClient
@Configuration
@RestController
@EnableOAuth2Sso
public class System1WebStart {


    public static void main(String[] args) {
        SpringApplication.run(System1WebStart.class,args);
    }
}
