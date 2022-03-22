package com.gastation.demo.gasstation.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "gas_station")
public class GasStation {

    private Long id;

    private List<Employee> employees;
}
