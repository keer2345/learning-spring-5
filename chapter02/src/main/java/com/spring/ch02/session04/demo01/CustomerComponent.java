package com.spring.ch02.session04.demo01;

import com.spring.ch02.session03.demo03.Address;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class CustomerComponent {
  private String cust_name;
  private int cust_id;
  private Address cust_address;

  public CustomerComponent() {
    cust_id = 100;
    cust_name = "cust_name";
    cust_address = new Address();
    cust_address.setBuild_no(2);
    cust_address.setCity_name("Delhi");
  }
}
