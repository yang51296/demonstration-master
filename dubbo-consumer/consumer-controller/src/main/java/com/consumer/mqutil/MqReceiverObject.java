package com.consumer.mqutil;

/**
 * Created by hp on 2018/5/7.
 */

import com.provider.pojo.AccountPojo;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
@RabbitListener(queues = "object")
public class MqReceiverObject {

    @RabbitHandler
    public void process(AccountPojo accountPojo) {
        System.out.println("Receiver object : " + accountPojo);
    }
}
