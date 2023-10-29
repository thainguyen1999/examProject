package com.example.examproject.dao;

import com.example.examproject.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {
    void create(EmployeeEntity employee);
    void delete (EmployeeEntity employee);
List<EmployeeEntity> getAllEmployee();
}
