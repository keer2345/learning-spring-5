package com.spring.ch02.demo01;

import lombok.extern.slf4j.Slf4j;

/**
 * Case1: Using Custom initialization and destruction methods
 *
 * @author keer
 */
@Slf4j
public class DemoCustomInit {

  private String message;
  private String name;

  public DemoCustomInit() {
    log.info("Case 1: constructor gets called for initializing data members in Custom init");
    System.out.println(
        "Case 1: constructor gets called for initializing data members in Custom init");
    message = "Welcome!!!";
    name = "no name";
  }

  @Override
  public String toString() {
    log.info("Case 1: toString() get called");
    System.out.println("Case 1: toString() get called");
    return "Case 1: " + message + "\t" + name;
  }

  public void myInit() {
    log.info("Case 1: myInit() get called");
    System.out.println("Case 1: myInit() get called");
    name = name.toUpperCase();
  }

  public void destroy() {
    log.info("Case 1: destroy() get called");
    System.out.println("Case 1: destroy() get called");
    name = null;
  }
}
