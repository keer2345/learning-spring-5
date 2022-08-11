package com.spring.ch02.session04.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session04.xml");
    CustomerComponent bean = (CustomerComponent) context.getBean("customerComponent");
    System.out.println(bean.getCust_name());
    System.out.println(bean.getCust_id());
    System.out.println(bean.getCust_address());
  }
}
