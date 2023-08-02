package com.example.springsandbox;


import com.example.springsandbox.clients.Buyer;
import com.example.springsandbox.clients.Seller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringSandboxApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Buyer buyer = context.getBean(Buyer.class);
        buyer.buySomething();

        Seller seller = context.getBean(Seller.class);
        seller.sellSomething();
    }

}
