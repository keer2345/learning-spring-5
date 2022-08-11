package com.spring.ch02.session05.demo03;

import com.spring.ch02.session05.demo02.Customer;
import lombok.Data;

@Data
public class Customer_Ref {
  private Customer cust_customer;
  private Address cust_address;
}
