package com.example.springsandbox.configs;

import com.example.springsandbox.clients.OtherVendor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {

    @Bean
    OtherVendor otherVendorBean() {
        return new OtherVendor();
    }

}
