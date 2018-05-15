package com.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.provider.rpc.IFanoutSender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version="0.1")
public class FanoutSender implements IFanoutSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "hi, fanout msg ";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
	}

}