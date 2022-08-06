package com.spring.ch02.session01.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
    DemoInitializingBean bean = (DemoInitializingBean) context.getBean("demo02");
    System.out.println(bean);
  }
}
