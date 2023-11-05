package com.org.employee.controller;

import com.org.employee.modal.Employee;
import com.org.employee.response.EmployeeResponse;
import com.org.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>>getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse>getEmployeeById(@PathVariable(value = "id")Long id){
        return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
    }


    @PostMapping("/employee")
    public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee=employeeService.saveEmployee(employee);
        return new ResponseEntity<>(savedEmployee,HttpStatus.OK);
    }

}
