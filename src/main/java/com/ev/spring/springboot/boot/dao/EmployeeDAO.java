package com.ev.spring.springboot.boot.dao;



import com.ev.spring.springboot.boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

   public Employee getEmployees(int id);

   public void deleteEmployee(int id);
}
