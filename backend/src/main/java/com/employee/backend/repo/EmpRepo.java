package com.employee.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.employee.backend.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp,Integer>{
    @Query(value = "SELECT * FROM Employee WHERE emp_address = ?1",nativeQuery = true)
    public List<Emp> getEmpByAdress(String address);
}