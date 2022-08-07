package com.spring.ch02.session02.demo03;

/**
 * Using static factory method
 *
 * @author keer
 */
public class CarService {
  private static CarService carService = new CarService();

  private CarService() {}

  public static CarService createService() {
    return carService;
  }

  public void server() {
    System.out.println("car service");
  }
}
