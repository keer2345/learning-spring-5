package com.spring.ch02.session01.demo01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session01.xml");
    DemoCustomInit bean = (DemoCustomInit) context.getBean("demo01");
    System.out.println(bean);
    ((AbstractApplicationContext) context).registerShutdownHook();
  }
}
