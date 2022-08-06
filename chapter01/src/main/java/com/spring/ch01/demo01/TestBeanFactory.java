package com.spring.ch01.demo01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestBeanFactory {
  public static void main(String[] args) {
    BeanFactory beanFactory1 = new XmlBeanFactory(new ClassPathResource("beans_classpath.xml"));

    String userHome = System.getProperty("user.home");
    BeanFactory beanFactory2 =
        new XmlBeanFactory(new FileSystemResource(userHome + "/beans_classpath.xml"));

    System.out.println("beanfactory created successfully");
  }
}
