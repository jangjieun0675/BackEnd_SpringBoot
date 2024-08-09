package com.restapi.emp.repository;

import com.restapi.emp.entity.Department;
import com.restapi.emp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByDepartmentNameContaining(String departmentName);
}
