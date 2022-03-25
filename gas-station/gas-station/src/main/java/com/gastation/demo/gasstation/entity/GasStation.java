package com.gastation.demo.gasstation.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gas_station")
public class GasStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employees")
    private List<Employee> employees;

    private String city;

    private String address;

    private String country;
}
