package com.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hp on 2018/5/18.
 */
//name:远程服务名，即spring.application.name配置的名称
@Service
@FeignClient(name="eureka-provider")
public interface EurekaRemote {
    //需要匹配服务提供者接口名称
    @RequestMapping(value = "/sayHello",method = RequestMethod.POST)
    public String sayHello();


}
