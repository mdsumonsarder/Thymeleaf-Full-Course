package com.example.Thymeleaf.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/employees")
public class EmployeeController {

    /*@GetMapping
    public String getEmployees(Model model){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com","ADMIN"));
        employees.add(new Employee("John", "Cena", "john@gmail.com","ADMIN"));
        employees.add(new Employee("Tom", "Cruise", "tom@gmail.com","USER"));
        employees.add(new Employee("Tony", "Stark", "tony@gmail.com","ADMIN"));

        model.addAttribute("employees",employees);
        return "employee";

    }*/

    @GetMapping
    public String getEmployees(Model model){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ramesh", "Fadatare", "ramesh@gmail.com","ADMIN"));
        employees.add(new Employee("John", "Cena", "john@gmail.com","ADMIN"));
        employees.add(new Employee("Tom", "Cruise", "tom@gmail.com","USER"));
        employees.add(new Employee("Tony", "Stark", "tony@gmail.com","ADMIN"));

        model.addAttribute("employees",employees);
        return "employees";

    }


}
