package com.example.springsandbox.clientsCom;


import com.example.springsandbox.servicesCom.BuyService;
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
