package com.spring.ch02.session01.demo03;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;

/**
 * Case3: Using DisposableBean to provide release of memory
 *
 * @author keer
 */
@Slf4j
public class DemoDisposableBean implements DisposableBean {
  private String message;
  private String name;

  public DemoDisposableBean() {
    log.info("Case 3: constructor gets called for initializing data members in Disposable Bean");
    message = "Welcome!!!";
    name = "no name";
  }

  @Override
  public String toString() {
    log.info("Case 3: toString() get called");
    return "Case 3: " + message + "\t" + name;
  }

  @Override
  public void destroy() throws Exception {
    log.info("Case 3: destroy from disposable bean get called");
    name = null;
  }
}
