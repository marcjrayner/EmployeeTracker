package com.codeclan.example.EmployeeTracker.controllers;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;
    
    //index
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    //show
    @GetMapping("{id}")
    public Optional<Employee> getEmployee(@PathVariable long id) {
        return employeeRepository.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeRepository.deleteById(id);
    }

}
