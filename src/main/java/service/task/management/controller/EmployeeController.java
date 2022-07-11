package service.task.management.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestBody;
import service.task.management.model.Employee;
import service.task.management.service.EmployeeService;

import java.time.Instant;
import java.util.List;

@Slf4j
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployeesList() {

        return employeeService.findAll();
    }

    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        employee.setCreatedAt(Instant.now().getEpochSecond());
        employee.setUpdatedAt(Instant.now().getEpochSecond());
        Employee employeeData = employeeService.createEmployee(employee);
        log.info("Employee created");
        return employeeData;
    }
}
