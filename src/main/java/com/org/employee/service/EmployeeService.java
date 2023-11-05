package com.org.employee.service;

import com.org.employee.feignclient.AddressClient;
import com.org.employee.modal.Employee;
import com.org.employee.repository.EmployeeRepository;
import com.org.employee.response.AddressResponse;
import com.org.employee.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressClient addressClient;

    public EmployeeResponse findById(Long id){
        ResponseEntity<AddressResponse> addressResponse=addressClient.getAddressResponse(new Long(2002));
        Employee employee=employeeRepository.findById(id);
        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setName(employee.getName());
        employeeResponse.setId(employee.getId());
        employeeResponse.setAge(employee.getAge());
        employeeResponse.setAddressResponse(addressResponse.getBody());
        return employeeResponse;
    }

    public List<Employee>getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
