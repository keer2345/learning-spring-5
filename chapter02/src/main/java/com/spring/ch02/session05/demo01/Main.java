package com.spring.ch02.session05.demo01;

import com.spring.ch02.session03.demo03.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    Customer customer = (Customer) context.getBean("customer");
    System.out.println(customer.getCust_name());
  }
}
