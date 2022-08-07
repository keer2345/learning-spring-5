package com.spring.ch02.session02.demo02;

import com.spring.ch02.session02.demo01.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext("session02.xml");
      Car car = (Car) context.getBean("car_obj_new");
      car.show();
  }
}
