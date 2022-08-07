package com.spring.ch02.session02.demo02;

import com.spring.ch02.session02.demo01.Car;

/**
 * Using factory method
 *
 * @author keer
 */
public class CarFactory {
  private static Car car = new Car();

  public Car buildCar() {
    System.out.println("building the car");
    return car;
  }
}
