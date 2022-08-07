package com.spring.ch02.session03.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session03.xml");
    Customer customer = (Customer) context.getBean("customer");
    System.out.println(customer.getCust_name() + "\t" + customer.getCust_address().getCity_name());
  }
}
