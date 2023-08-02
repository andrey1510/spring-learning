package com.example.springsandbox.clients;


import com.example.springsandbox.services.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Buyer {

    @Autowired
    private BuyService buyService;

    public void buySomething() {
        buyService.printBuyOrder("something");
    }
}
