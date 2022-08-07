package com.spring.ch02.session01.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session01.xml");
    DemoDisposableBean bean = (DemoDisposableBean) context.getBean("demo03");
    System.out.println(bean);
    ((AbstractApplicationContext) context).registerShutdownHook();
  }
}
