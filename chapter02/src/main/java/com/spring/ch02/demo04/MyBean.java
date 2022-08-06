package com.spring.ch02.demo04;

import com.spring.ch02.demo02.DemoInitializingBean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Case4: Making the bean aware of Container
 *
 * @author keer
 */
public class MyBean implements ApplicationContextAware {
  private ApplicationContext context;

  @Override
  public void setApplicationContext(ApplicationContext context) throws BeansException {
    System.out.println("Case 4: context set");
    this.context = context;
  }

  public void display() {
    System.out.println((DemoInitializingBean) context.getBean("demo02"));
  }
}
