package com.spring.ch01.demo03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestFileSystemApplicationContext {
  public static void main(String[] args) {
    ApplicationContext context =
        new FileSystemXmlApplicationContext("chapter01/src/main/resources/beans_classpath.xml");
    System.out.println("container created successfully");
  }
}
