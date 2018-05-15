package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.provider.model.AccountModel;
import com.provider.pojo.AccountPojo;
import com.provider.rpc.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Created by hp on 2018/5/7.
 */
@RestController
public class ReceiveMqDemo {

    @Reference(version="0.1")
    private IMqSender iMqSender;

    @Reference(version="0.1")
    private IMqSenderTwo iMqSenderTwo;

    @Reference(version="0.1")
    private IMqSenderObject iMqSenderObject;

    @Reference(version="0.1")
    private IFanoutSender iFanoutSender;

    @Reference(version="0.1")
    private ITopicSender iTopicSender;

    @RequestMapping(value = "/mqInvoke",method = RequestMethod.POST)
    @ApiOperation(value="mq调用演示简单调用", notes="mq调用演示,简单调用")
    public void process(@RequestParam String context)
    {
        iMqSender.send(context);

    }

    @RequestMapping(value = "/mqInvokeTwo",method = RequestMethod.POST)
    @ApiOperation(value="mq调用演示一对多调用", notes="mq调用演示,一对多调用")
    public void oneToMany(@RequestParam String context)
    {
        for (int i=0;i<100;i++){
            iMqSender.send(String.valueOf(i));
        }
    }

    @RequestMapping(value = "/mqInvokeThree",method = RequestMethod.POST)
    @ApiOperation(value="mq调用演示,多对多调用", notes="mq调用演示,多对多调用")
    public void manyToMany(@RequestParam String context)
    {
        for (int i=0;i<100;i++){
            iMqSender.send(String.valueOf(i));
            iMqSenderTwo.send(String.valueOf(i));
        }
    }

    @RequestMapping(value = "/sendObject",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="mq调用演示,对象支持", notes="mq调用演示,对象支持")
    public void sendObject(@RequestBody AccountPojo accountPojo)
    {
        iMqSenderObject.send(accountPojo);
    }

    @RequestMapping(value = "/sendFanout",method = RequestMethod.POST)
    @ApiOperation(value = "mq调用演示,广播模式",notes="mq调用演示,广播模式")
    public void sendFanout() {
        iFanoutSender.send();
    }

    @RequestMapping(value = "/sendTopic",method = RequestMethod.POST)
    @ApiOperation(value = "mq调用演示,路由模式匹配",notes="mq调用演示,路由模式匹配")
    public void sendTopic() {
        iTopicSender.send();
        iTopicSender.send1();
        iTopicSender.send2();
    }
}
