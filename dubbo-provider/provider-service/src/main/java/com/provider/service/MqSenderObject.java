package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.provider.pojo.AccountPojo;
import com.provider.rpc.IMqSenderObject;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hp on 2018/5/7.
 */
@Component
@Service(version = "0.1")
public class MqSenderObject implements IMqSenderObject{
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Override
    public void send(AccountPojo accountPojo) {
        System.out.println("Sender object: " + accountPojo.toString());
        this.rabbitTemplate.convertAndSend("object", accountPojo);
    }
}
