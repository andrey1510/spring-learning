package com.example.springsandbox.clients;

import com.example.springsandbox.services.VendorService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vendor {

    @Resource(name = "vendorServiceBean1")
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
