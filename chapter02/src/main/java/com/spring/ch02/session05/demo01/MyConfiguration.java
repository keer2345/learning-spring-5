package com.spring.ch02.session05.demo01;

import com.spring.ch02.session03.demo03.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public Customer customer(){
        Customer customer=new Customer();
        customer.setCust_name("NAME");
        return customer;
    }
}
