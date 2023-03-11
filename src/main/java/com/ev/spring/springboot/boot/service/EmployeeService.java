package com.ev.spring.rest.service;





public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
