package com.example.springsandbox.services;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class VendorService implements BeanNameAware, ApplicationContextAware {
    // Конструктор, чтобы поймать инициализациюю
    private String beanName;
    private ApplicationContext applicationContext;

    public void printVendor() {
        System.out.println("print vendor" + " bean type:" + this.getClass() + " bean name:" + beanName);
        if (applicationContext.isPrototype(beanName)) {
            System.out.println("Prototype");
        } else {
            System.out.println("Singleton");
        }
        printListOfBeans();
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    private void printListOfBeans() {
        applicationContext.getBeanDefinitionNames();
        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
