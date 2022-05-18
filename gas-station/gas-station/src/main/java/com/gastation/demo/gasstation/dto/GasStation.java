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

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private String country;

    private String nintyFiveBMB;

    private String nintyEightBMB;


}
