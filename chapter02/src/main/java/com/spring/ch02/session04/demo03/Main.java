package com.spring.ch02.session04.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session04-scope.xml");
    CustomerScope customer = (CustomerScope) context.getBean("customerScope");
    System.out.println(customer.getCust_name() + "\t" + customer.getCust_id() +
            customer.getCust_address().getCity_name());
    customer.setCust_name("new name set");

    CustomerScope customer1 = (CustomerScope) context.getBean("customerScope");
    System.out.println(customer1.getCust_name() + "\t" + customer1.getCust_id() +
            customer1.getCust_address().getCity_name());
    System.out.println("after changing name and using prototype scope");
    System.out.println(customer.getCust_name() + "\t" + customer.getCust_id() +
            customer.getCust_address().getCity_name());
    System.out.println(customer1.getCust_name() + "\t" + customer1.getCust_id() +
            customer1.getCust_address().getCity_name());
  }
}
