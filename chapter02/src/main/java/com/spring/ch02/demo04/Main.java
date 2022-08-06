package com.spring.ch02.demo04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext("demo.xml");
      MyBean bean = (MyBean) context.getBean("demo04");
      bean.display();
  }
}
