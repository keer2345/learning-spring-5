package com.spring.ch02.session03.demo04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("session03.xml");
    EnggStudent student_old = (EnggStudent) context.getBean("engg_old");
    System.out.println(student_old.toString());

    EnggStudent student_new = (EnggStudent) context.getBean("engg_new");
    System.out.println(student_new.toString());

    EnggStudent student_new1 = (EnggStudent) context.getBean("engg_new1");
    System.out.println(student_new1.toString());
  }
}
