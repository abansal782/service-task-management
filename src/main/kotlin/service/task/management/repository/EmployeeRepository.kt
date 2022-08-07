package service.task.management.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import service.task.management.model.Employee

//@Repository
interface EmployeeRepository : CrudRepository<Employee, String>