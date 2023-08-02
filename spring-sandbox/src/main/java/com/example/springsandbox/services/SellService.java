package com.example.springsandbox.services;

import org.springframework.stereotype.Service;

@Service
public class SellService {
    public void printSellOrder(String item){
        System.out.println("sell: " + item);
    }
}
