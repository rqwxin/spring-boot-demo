package com.cgx.springboot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;


/***********
 *
 */
@SpringBootApplication
@ComponentScan("com.cgx")
public class SwaggerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SwaggerApplication.class, args);
        ConfigurableEnvironment environment = context.getEnvironment();
    }

}
