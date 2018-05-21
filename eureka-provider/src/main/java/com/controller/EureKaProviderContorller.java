package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/5/18.
 */
@RestController
public class EureKaProviderContorller {
    @RequestMapping(value="sayHello",method = RequestMethod.POST)
    public String sayHello(){
        return"hello i am provider";
    }
}
