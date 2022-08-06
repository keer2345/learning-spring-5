package com.spring.ch01.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClasspathApplicationContext {
  public static void main(String[] args) {
    // case1:
    ApplicationContext context = new ClassPathXmlApplicationContext("beans_classpath.xml");

    // case2:
    ApplicationContext context1 =
        new ClassPathXmlApplicationContext(
            new String[] {"beans_classpath.xml", "beans_classpath1.xml"});

    System.out.printf("container created successfully");
  }
}
