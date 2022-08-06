package com.spring.ch02.demo05;

import com.spring.ch02.demo01.DemoCustomInit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
    DemoBeanPostProcessor bean = (DemoBeanPostProcessor) context.getBean("demo05");
    System.out.println(bean);
  }
}
