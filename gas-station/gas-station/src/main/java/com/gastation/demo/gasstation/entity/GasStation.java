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

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "country")
    private String country;

    @Column(name = "ninety_five")
    private String ninetyFiveBMB;

    private String ninetyEightBMB;

    private String diesel;

    public GasStation() {
    }

    public GasStation(List<Employee> employees, String city, String address, String country, String nintyFiveBMB, String nintyEightBMB, String disel) {
        this.employees = employees;
        this.city = city;
        this.address = address;
        this.country = country;
        this.nintyFiveBMB = nintyFiveBMB;
        this.nintyEightBMB = nintyEightBMB;
        this.disel = disel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNintyFiveBMB() {
        return nintyFiveBMB;
    }

    public void setNintyFiveBMB(String nintyFiveBMB) {
        this.nintyFiveBMB = nintyFiveBMB;
    }

    public String getNintyEightBMB() {
        return nintyEightBMB;
    }

    public void setNintyEightBMB(String nintyEightBMB) {
        this.nintyEightBMB = nintyEightBMB;
    }

    public String getDisel() {
        return disel;
    }

    public void setDisel(String disel) {
        this.disel = disel;
    }
}
