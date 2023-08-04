package com.example.springsandbox.clients;

import com.example.springsandbox.services.VendorService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vendor implements BeanNameAware {

    private static Logger log = LoggerFactory.getLogger(Vendor.class);

    public void doSomething() {
        log.info("doing something");
    }

    @Value("${name}:jjj")
    private String name;
    
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void printBeanName() {
        System.out.println("Bean Name: " + beanName);
        System.out.println(name);
    }




    @Autowired
    @Qualifier("vendorServiceBean1")
    public VendorService vendorService1;

    @Autowired
    @Qualifier("vendorServiceBean2")
    public VendorService vendorService2;

    public void getData() {
        System.out.println("Vendor class data");
        vendorService1.printVendor();
        vendorService2.printVendor();
    }



}
