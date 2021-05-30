package com.bala.ms.departmentservice.controller;

import com.bala.ms.departmentservice.entity.Department;
import com.bala.ms.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("departments")
public class DepartmentController {
    @Autowired
 private DepartmentService service;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Department Controller Savedept method");
        return service.saveDepartment(department);
    }

    @GetMapping("/{id}")
   public Department findDepartmentById(@PathVariable("id") long id){
       log.info("Inside Department Controller Find dept method");
       return service.findDepartmentById(id);
   }
}
