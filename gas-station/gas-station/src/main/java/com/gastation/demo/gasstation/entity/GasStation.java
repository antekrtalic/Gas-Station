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

    public GasStation(List<Employee> employees, String city, String address, String country, String ninetyFiveBMB, String ninetyEightBMB, String diesel) {
        this.employees = employees;
        this.city = city;
        this.address = address;
        this.country = country;
        this.ninetyFiveBMB = ninetyFiveBMB;
        this.ninetyEightBMB = ninetyEightBMB;
        this.diesel = diesel;
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

    public String getNinetyFiveBMB() {
        return ninetyFiveBMB;
    }

    public void setNinetyFiveBMB(String ninetyFiveBMB) {
        this.ninetyFiveBMB = ninetyFiveBMB;
    }

    public String getNinetyEightBMB() {
        return ninetyEightBMB;
    }

    public void setNinetyEightBMB(String ninetyEightBMB) {
        this.ninetyEightBMB = ninetyEightBMB;
    }

    public String getDiesel() {
        return diesel;
    }

    public void setDiesel(String diesel) {
        this.diesel = diesel;
    }
}
