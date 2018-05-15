package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.provider.rpc.IMqSender;
import com.provider.rpc.IMqSenderTwo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/5/7.
 */
@Component
@Service(version = "0.1")
public class MqSenderTwo implements IMqSenderTwo {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Override
    public void send(String context) {
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("dubbo-mq-demonstration", context);
    }


}
