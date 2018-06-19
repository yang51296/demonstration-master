package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/6/15.
 */
@RestController
public class controller {
    @RequestMapping("/abc")
    public String index() {
        return "Hello abc";
    }
}
