package service.task.management.service

import service.task.management.model.Employee

interface EmployeeService {
    fun findAll(): List<Employee>

    fun createEmployee(employee: Employee): Employee

    fun getById(employee_id: String): Employee?
}