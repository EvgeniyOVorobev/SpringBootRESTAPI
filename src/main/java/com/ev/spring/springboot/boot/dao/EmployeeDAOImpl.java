package com.ev.spring.springboot.boot.dao;


import com.ev.spring.springboot.boot.entity.Employee;
import jakarta.persistence.EntityManager;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import jakarta.persistence.Query;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private EntityManager entityManager;



    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//        List<Employee> allEmployees=session.createQuery("from Employee ", Employee.class)
//                . getResultList();
        Query query =entityManager.createQuery("from Employee ");
        List <Employee> allEmployees=query.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
//        Session session=entityManager.unwrap(Session.class);

//        session.saveOrUpdate(employee);
       Employee employee1= entityManager.merge(employee);
       employee.setId(employee1.getId());
    }

    @Override
    public Employee getEmployees(int id) {
//        Session session=entityManager.unwrap(Session.class);
//        Employee employee=session.get(Employee.class,id);
        Employee employee=entityManager.find(Employee.class,id);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
//        Session session=entityManager.unwrap(Session.class);
//        Query<Employee> employeeQuery=session.createQuery("delete from Employee where id=:employeeId");
//        employeeQuery.setParameter("employeeId",id);
//        employeeQuery.executeUpdate();
        Query query=entityManager.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId",id);
        query.executeUpdate();
    }
}
