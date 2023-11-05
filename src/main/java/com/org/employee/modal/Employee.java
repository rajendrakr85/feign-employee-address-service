package com.org.employee.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id

    private Long id;
    private String name;
    private String designation;
    private Integer salary;
    private Integer age;
    private Integer addressid;
}