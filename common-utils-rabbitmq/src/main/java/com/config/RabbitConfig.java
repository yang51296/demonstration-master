package com.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列配置
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("dubbo-mq-demonstration");
    }
    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }


}
