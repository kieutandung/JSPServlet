package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee(1,"tam",17,"nhân viên","phòng nhân sự",999));
        employees.add(new Employee(2,"tam",17,"nhân viên","phòng nhân sự",999));
        employees.add(new Employee(3,"tam",17,"nhân viên","phòng nhân sự",999));
        employees.add(new Employee(4,"tam",17,"nhân viên","phòng nhân sự",999));
        employees.add(new Employee(5,"tam",17,"nhân viên","phòng nhân sự",999));
    }
    public List<Employee> getAllEmployee(){
        return employees;
    }
}
