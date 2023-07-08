package com.springbootmicroservice.department.controller;

import com.springbootmicroservice.department.entity.Department;
import com.springbootmicroservice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method in DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{Id}")
    public Department findByDepartmentId(@PathVariable Long departmentId){
        log.info("Inside getDepartmentById method in DepartmentController");
        return departmentService.findByDepartmentId(departmentId);
    }
}
