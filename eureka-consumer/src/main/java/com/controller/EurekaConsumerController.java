package com.controller;

import com.remote.EurekaRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/5/18.
 */
//name:远程服务名，即spring.application.name配置的名称
@RestController

public class EurekaConsumerController {
    @Autowired
    private EurekaRemote eurekaRemote;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return eurekaRemote.sayHello();
    }

}
