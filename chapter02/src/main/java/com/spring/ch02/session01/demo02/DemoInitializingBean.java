package com.spring.ch02.session01.demo02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

/**
 * Case2: Using InitializingBean to provide initialization
 *
 * @author keer
 */
@Slf4j
public class DemoInitializingBean implements InitializingBean {
  private String message;
  private String name;

  public DemoInitializingBean() {
    log.info(
        "Case 2: constructor gets called for initializing data members in demo Initializing bean");
    message = "welcome!!!";
    name = "no name";
  }

  @Override
  public String toString() {
    log.info("Case 2: toString() get called");
    return "Case 2: " + message + "\t" + name;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    log.info("Case 2: after propertiesSet got called");
    name = "Mr. " + name.toUpperCase();
  }
}
