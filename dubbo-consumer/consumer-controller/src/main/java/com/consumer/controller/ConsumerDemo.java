package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.provider.pojo.AccountPojo;
import com.provider.rpc.IAccountRpc;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hp on 2018/5/4.
 */
@RestController
public class ConsumerDemo {
    @Reference(version="0.1")
    private IAccountRpc iAccountRpc;

    @RequestMapping(value = "/consumerInvoke",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="消费者调用生产者演示", notes="消费者调用生产者演示")
    public String consumerInvoke(){
        List<AccountPojo> accountPojoList = iAccountRpc.findAll();
        StringBuilder stringBuilder = new StringBuilder(2);
        stringBuilder.append(accountPojoList.size());
        stringBuilder.append("---->");
        stringBuilder.append(accountPojoList.get(0).getAccountCode());
        return stringBuilder.toString();
    }
}
