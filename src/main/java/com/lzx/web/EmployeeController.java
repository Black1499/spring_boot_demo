package com.lzx.web;

import com.lzx.dao.EmployeeMapper;
import com.lzx.entity.Employee;
import com.lzx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("emp")
    @ResponseBody
    public List<Employee> listEmployee() {
        return service.selectAll();
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
