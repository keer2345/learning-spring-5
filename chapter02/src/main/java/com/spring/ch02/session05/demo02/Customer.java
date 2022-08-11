package com.spring.ch02.session05.demo02;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Customer {
    private String cust_name;
    private String cust_id;
    private boolean second_handed;
    private double prod_price;
    private String prod_name;
}
