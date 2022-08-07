package com.spring.ch02.session03.demo02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {

  private String chesis_number;
  private String color;
  private String fule_type;
  private long price;
  private double average;

  public void show() {
    System.out.println(
        "showing car " + chesis_number + " having color:-" + color + "and price:-" + price);
  }
}
