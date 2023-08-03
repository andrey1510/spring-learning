package com.example.springsandbox.configs;

import com.example.springsandbox.clients.Client;
import com.example.springsandbox.clients.Vendor;
import com.example.springsandbox.services.VendorService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@Import(OtherConfig.class)
public class AppConfig {


    @Bean
    @Lazy
    public Client clientBean() {
        return new Client();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    @DependsOn("clientBean")
    public Vendor vendorBean() {
        return new Vendor();
    }

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public VendorService vendorServiceBean1() {
        return new VendorService();
    }

    @Bean
    public VendorService vendorServiceBean2() {
        return new VendorService();
    }
}
