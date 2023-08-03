package com.example.springsandbox.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"com.example.springsandbox.clientsCom",
        "com.example.springsandbox.servicesCom"})
public class ComponentConfig {

}
