package com.spring.ch02.session04.demo02;

import com.spring.ch02.session03.demo03.Address;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class CustomerAutowired {

  private String custName;
  private int custId;
  @Autowired(required = false)
  @Qualifier(value = "address")
  private Address custAddress;

  public CustomerAutowired() {
    custId = 10;
    custName = "my name";
  }
}
