package com.gastation.demo.gasstation.dto;

import com.gastation.demo.gasstation.entity.Employee;
import lombok.Getter;

import java.util.List;

public class GasStation {

    @Getter
    private Long id;

    private List<Employee> employees;

    private String city;

    private String address;

    private String country;

    private String nintyFiveBMB;

    private String nintyEightBMB;


}
