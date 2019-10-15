package com.wjsy.wjsyregistereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WjsyRegisterEurekaApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WjsyRegisterEurekaApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WjsyRegisterEurekaApplication.class);
    }

}
