package com.org.employee.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeResponse {
    private Long id;
    private String name;
    private Integer age;
    private AddressResponse addressResponse;
}
