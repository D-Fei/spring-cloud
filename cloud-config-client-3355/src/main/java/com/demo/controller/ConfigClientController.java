package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope  加入这个注解后，本类下@Value取值为null，并且不会报错
@Scope(scopeName="refresh")  //改为这个注解解决问题
//每当修改GitHub中的配置文件后，需要运维者手动cmd curl -X POST "http://localhost:3355/actuator/refresh"命令才能刷新内容
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping(value = "/configInfo")
    private String getConfigInfo() {

        return configInfo;
    }

}
