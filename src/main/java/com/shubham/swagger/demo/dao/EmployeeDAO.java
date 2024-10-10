package com.shubham.swagger.demo.dao;

import com.shubham.swagger.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
