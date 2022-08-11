package com.spring.ch02.session05.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Main {
  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("session05-demo03.xml");
    Customer_Ref bean = (Customer_Ref) context.getBean("cust_ref");
    System.out.println(bean);
  }
}
