package com.consultadd.services;

import com.consultadd.Repository.EmployeeRepository;
import com.consultadd.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    public String saveEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId()))
        {
            return "Id already Exists !";
        }
        else
        {
            employeeRepository.save(employee);
            return "Employee Data added .";
        }
    }

    public  String updateEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId()))
        {
            employeeRepository.save(employee);
            return  "Employee data updated successfully .";
        }
        else {
            return "Employee data is invalid ! ";
        }
    }

    public String deleteEmployee(String id)
    {
        if(employeeRepository.existsById(id))
        {
            employeeRepository.deleteById(id);
            return "Employee data deleted successful .";
        }else
        {
            return "invalid Id !";
        }
    }

    public List<Employee> findAllByCity(String city){
        return employeeRepository.findAllByCity(city);
    }




}
