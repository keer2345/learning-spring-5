package com.spring.ch02.session03.demo04;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class EnggStudent extends Student{
    private String branchCode;
    private String collegeCode;
}
