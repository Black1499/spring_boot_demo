package com.lzx.dao;

import com.lzx.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Employee record);

    Employee selectByPrimaryKey(String id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
}