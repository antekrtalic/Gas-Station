package com.gastation.demo.gasstation.dto;

import com.gastation.demo.gasstation.entity.Employee;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class GasStation {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private List<Employee> employees;


    private String city;

    private String address;

    private String country;

    private String nintyFiveBMB;

    private String nintyEightBMB;


}
