package com.consultadd.controller;

import com.consultadd.Repository.EmployeeRepository;
import com.consultadd.model.Employee;
import com.consultadd.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
// controller -> services (busnuss logic) -> Repository
    @GetMapping("/employee")
    public List<Employee> getEmployees()
    {
        System.out.println("GET called");
        List<Employee> employeesList = employeeService.getEmployees();
        return employeesList;
    }

    @PostMapping("/addEmp")
    public  String saveEmployee(@RequestBody Employee employee){
        System.out.println("POST called");
        return employeeService.saveEmployee(employee);
    }


    @PutMapping("/updateEmp")
    public  String updateEmployee(@RequestBody Employee employee)
    {
        return  employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmp")
    public  String deleteEmployee(@RequestParam String id)
    {
        return  employeeService.deleteEmployee(id);
    }


}
