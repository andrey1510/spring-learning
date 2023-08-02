package com.example.springsandbox.services;

import org.springframework.stereotype.Service;

@Service
public class BuyService {
    public void printBuyOrder(String item){
        System.out.println("buy: " + item);
    }
}
