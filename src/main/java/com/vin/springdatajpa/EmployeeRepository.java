package com.vin.springdatajpa;

import com.vin.springdatajpa.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findEmployeeByLastNameContaining(String str);
}
