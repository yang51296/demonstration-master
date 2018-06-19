package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * Created by hp on 2018/6/15.
 */
@SpringBootApplication
@EnableOAuth2Sso
public class TestOauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestOauthApplication.class, args);
    }
}
