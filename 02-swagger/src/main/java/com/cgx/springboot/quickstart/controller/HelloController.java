package com.cgx.springboot.quickstart.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "hello",value = "imya")
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("info")
    @ApiOperation("info")
    public String info(){
        String applicationName = applicationContext.getApplicationName();
        String id = applicationContext.getId();
        return id+applicationName;
    }
}
