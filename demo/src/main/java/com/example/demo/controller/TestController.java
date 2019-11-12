package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.List;

/**
 * @Author zyy
 * @Date 2019/10/14 15:23
 * @Version 1.0
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/services")
    public List<String> services() {
        return this.discoveryClient.getServices();
    }


    @RequestMapping("/{test}/a")
    public String test1(@PathVariable String test) {

        return test+"/a";
    }

    @RequestMapping
    public  String test() throws UnknownHostException, SocketException {
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


}
