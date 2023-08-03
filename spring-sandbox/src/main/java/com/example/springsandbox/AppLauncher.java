package com.example.springsandbox;


import com.example.springsandbox.clients.Client;
import com.example.springsandbox.clients.Vendor;
import com.example.springsandbox.configs.AppConfig;
import com.example.springsandbox.services.VendorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppLauncher {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Vendor vendor = context.getBean(Vendor.class);
        vendor.getData();

        Client client = context.getBean(Client.class);
        client.print();


    }

}
