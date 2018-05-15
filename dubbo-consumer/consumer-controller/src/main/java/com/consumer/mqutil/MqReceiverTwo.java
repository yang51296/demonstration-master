package com.consumer.mqutil;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/5/7.
 */
@Component
public class MqReceiverTwo {

    @RabbitListener(queues = "dubbo-mq-demonstration")
    @RabbitHandler
    public void process(String text) {
        System.out.println("接收者2号  : " + text);
    }

}