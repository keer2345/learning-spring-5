package com.spring.ch02.session02.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session02.xml");
    CarService carService = (CarService) context.getBean("carService");
    carService.server();
  }
}
