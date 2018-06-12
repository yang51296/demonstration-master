package com.controller;

import com.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/5/18.
 */
@RestController
public class EureKaProviderContorller {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="sayHello",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "getFallBack")
    public String sayHello(){
        User user = userRepository.findOne(Long.parseLong("1"));
        user.getAge();
        return"hello i am provider";
    }

    @RequestMapping(value="")
    public String datajpa(){
        return null;
    }

    public String getFallBack(){
        return "断路器";
    }
}
