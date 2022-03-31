package com.gastation.demo.gasstation.repository;

import com.gastation.demo.gasstation.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
