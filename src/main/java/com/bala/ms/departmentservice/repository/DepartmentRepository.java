package com.bala.ms.departmentservice.repository;

import com.bala.ms.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
Department findByDepartmentId(Long id);

}
