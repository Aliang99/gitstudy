package com.aliang.git.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ALiang
 * @Date: 2021/3/17 17:38
 * @Description:
 */
@RestController
public class TestController2 {

    @GetMapping("test")
    public String test(){
        return "Hello world";
    }
}
