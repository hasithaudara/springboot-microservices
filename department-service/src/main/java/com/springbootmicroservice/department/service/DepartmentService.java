package com.springbootmicroservice.department.service;

import com.springbootmicroservice.department.entity.Department;
import com.springbootmicroservice.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method in DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside getDepartmentById method in DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
