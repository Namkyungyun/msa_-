package com.namkyung.memberservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Slf4j
public class MemberServiceController {

    @Value("${name.value}")
    private String configStr;

    @GetMapping("/member")
    public String getName(){
        log.info(configStr);
        return configStr;
    }
}
