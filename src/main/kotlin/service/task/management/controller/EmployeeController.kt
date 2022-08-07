package service.task.management.controller

import com.google.inject.Inject
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RequestBody
import service.task.management.model.Employee
import service.task.management.service.EmployeeService

import java.time.Instant

@RestController
@RequestMapping("employee")
class EmployeeController @Inject constructor(
    val employeeService: EmployeeService
) {

    companion object {
        val log: Logger = LoggerFactory.getLogger(EmployeeController::class.java)
    }

    @GetMapping()
    fun getEmployeeList(): List<Employee>{
        return employeeService.findAll()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createEmployee(@RequestBody employee: Employee): Employee{
        employee.createdAt = Instant.now().epochSecond
        employee.updatedAt = Instant.now().epochSecond
        val employeeDetails = employeeService.createEmployee(employee)
        log.info("Employee with id ${employeeDetails.id} created")

        return employeeDetails
    }
}