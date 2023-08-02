package com.example.springsandbox.clients;

import com.example.springsandbox.services.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Seller {
    @Autowired
    private SellService sellService;

    public void sellSomething() {
        sellService.printSellOrder("something");
    }
}
