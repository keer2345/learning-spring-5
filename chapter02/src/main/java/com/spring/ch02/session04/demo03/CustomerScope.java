package com.spring.ch02.session04.demo03;

import com.spring.ch02.session03.demo03.Address;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
@Data
public class CustomerScope {

  private String cust_name;
  private int cust_id;

  @Autowired
  @Qualifier(value = "address")
  private Address cust_address;

  public CustomerScope() {
    // TODO Auto-generated constructor stub
    cust_id = 10;
    cust_name = "my name";
  }
}
