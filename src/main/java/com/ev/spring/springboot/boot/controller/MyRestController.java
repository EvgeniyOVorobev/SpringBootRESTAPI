package com.ev.spring.springboot.boot.controller;


import com.ev.spring.springboot.boot.entity.Employee;
import com.ev.spring.springboot.boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> ShowAllEmployees(){
        List<Employee> allEmployees=employeeService.getAllEmployees();
        return allEmployees;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){
        Employee employee=employeeService.getEmployee(id);
        return employee;
    }
}
