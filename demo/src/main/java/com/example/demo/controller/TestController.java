package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zyy
 * @Date 2019/10/14 15:23
 * @Version 1.0
 */
@RestController
public class TestController {


    @RequestMapping("/{test}")
    public String test(@PathVariable String test) {
        return test;
    }
}
