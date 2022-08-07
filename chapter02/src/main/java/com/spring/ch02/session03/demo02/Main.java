package com.spring.ch02.session03.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("session03.xml");
        Car car = (Car) context.getBean("demo02");
        car.show();
    }
}
