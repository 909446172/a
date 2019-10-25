package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author zyy
 * @Date 2019/10/23 18:13
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix = "test",ignoreUnknownFields = true)
@Data
public class Test {

    private Map str ;


}
