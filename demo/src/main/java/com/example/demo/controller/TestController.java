package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author zyy
 * @Date 2019/10/14 15:23
 * @Version 1.0
 */
@Slf4j
@RestController
public class TestController {


    @RequestMapping
    public  String test() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        return inetAddress.getHostAddress() + "\t" + inetAddress.getHostName() + "\t" + inetAddress.getCanonicalHostName();
    }
    @RequestMapping("/{test}")
    public String test(@PathVariable String test) {
        log.debug(test);
        log.info(test);
        log.warn(test);
        log.error(test);
        return test;
    }

    @RequestMapping("/a/{test}")
    public String atest(@PathVariable String test) {
        return test;
    }
}
