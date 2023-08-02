package com.example.springsandbox;

import com.example.springsandbox.clients.Buyer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"com.example.springsandbox.clients", "com.example.springsandbox.services"})
public class AppConfig {

}
