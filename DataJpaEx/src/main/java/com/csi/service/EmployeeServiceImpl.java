package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee save(Employee employee){
        return employeeRepositoryImpl.save(employee);
        }

        public Optional<Employee> findById(int empId){
        return employeeRepositoryImpl.findById(empId);

    }
    public List<Employee> findAll(){

        return employeeRepositoryImpl.findAll();
    }

    public Employee update(Employee employee){

        return employeeRepositoryImpl.save(employee);
    }

    public  void deleteById(int empId){

        employeeRepositoryImpl.deleteById(empId);
    }



}
