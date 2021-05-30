package com.bala.ms.departmentservice.service;

import com.bala.ms.departmentservice.entity.Department;
import com.bala.ms.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository repo;

    public Department saveDepartment(Department department){
        log.info("Inside Save Department method of Dept Service");
        return repo.save(department);
    }

    public Department findDepartmentById(Long id){
        log.info("Inside FindByDepartmentId method of Dept Service");
        return repo.findByDepartmentId(id);

    }

}
