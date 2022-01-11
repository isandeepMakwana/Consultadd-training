package com.consultadd.Repository;


import com.consultadd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String> {
    List<Employee> findAllByCity(String city);
//    public  Employee getEmployeeByEmployeeName();
}
