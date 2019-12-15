package com.cgx.springboot.redis.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**********
 * @program: spring-boot-demo
 * @description:
 * @author: cgx
 * @create: 2019-10-26 14:24
 **/
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("info")
    public String info(){
        logger.info("/hello/info");
        logger.error("error /hello/info");
        logger.debug("debug /hello/info");
        logger.warn("warn /hello/info");
        String applicationName = applicationContext.getApplicationName();
        String id = applicationContext.getId();
        return id+applicationName;
    }
}
