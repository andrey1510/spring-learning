package com.example.springsandbox;


import com.example.springsandbox.clientsCom.Buyer;
import com.example.springsandbox.clientsCom.Seller;
import com.example.springsandbox.configs.ComponentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentLauncher {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);

        Buyer buyer = context.getBean(Buyer.class);
        buyer.buySomething();

        Seller seller = context.getBean(Seller.class);
        seller.sellSomething();
    }

}
