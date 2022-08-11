package com.spring.ch02.session05.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session05-demo02.xml");
    Customer customer = (Customer) context.getBean("cust_new");
    System.out.println(customer);
  }
}
