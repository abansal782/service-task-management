package service.task.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.task.management.model.Employee;
import service.task.management.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {

        List<Employee> tasks = (List<Employee>) repository.findAll();

        return tasks;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee employeeData = repository.save(employee);
        return employeeData;
    }

}
