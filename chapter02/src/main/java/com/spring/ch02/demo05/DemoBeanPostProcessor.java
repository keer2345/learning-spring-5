package com.spring.ch02.demo05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Case5: Using BeanPostProcessor.
 *
 * @author keer
 */
public class DemoBeanPostProcessor implements BeanPostProcessor {
  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("initializing bean before init: " + beanName);
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("initializing bean after init: " + beanName);
    return bean;
  }
}
