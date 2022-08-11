package com.spring.ch02.session04.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session04-autowired.xml");
    CustomerAutowired bean = (CustomerAutowired) context.getBean("customerAutowired");
    System.out.println(bean.getCustName());
    System.out.println(bean.getCustId());
    System.out.println(bean.getCustAddress().getCity_name());
  }
}
