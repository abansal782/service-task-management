package service.task.management.service;

import service.task.management.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee createEmployee(Employee employee);
}
