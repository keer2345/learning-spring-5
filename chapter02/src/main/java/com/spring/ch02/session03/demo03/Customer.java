package com.spring.ch02.session03.demo03;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private String cust_name;
    private int cust_id;
    private Address cust_address;
}
