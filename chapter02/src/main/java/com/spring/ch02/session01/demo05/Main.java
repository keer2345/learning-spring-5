package com.spring.ch02.session01.demo05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session01.xml");
    DemoBeanPostProcessor bean = (DemoBeanPostProcessor) context.getBean("demo05");
    System.out.println(bean);
  }
}
