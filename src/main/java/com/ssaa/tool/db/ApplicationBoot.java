package com.ssaa.tool.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(scanBasePackages = "com.ssaa.tool.db")
public class ApplicationBoot {

    public static ConfigurableApplicationContext getContext(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationBoot.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        return app.run(args);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBoot.class, args);
    }
}
