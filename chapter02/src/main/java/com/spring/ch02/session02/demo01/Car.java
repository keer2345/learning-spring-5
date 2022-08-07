package com.spring.ch02.session02.demo01;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * Instance creation
 *
 * @author keer
 */
@Setter
@AllArgsConstructor
public class Car {
  private String chesis_num, color, fuel_type;
  private long price;
  private double average;

  public Car() {
    chesis_num = "eng00";
    color = "white";
    fuel_type = "diesel";
    price = 5700001;
    average = 12d;
  }

  public void show() {
    System.out.println(
        "show_car " + chesis_num + " having color: " + color + " and price: " + price);
  }
}
