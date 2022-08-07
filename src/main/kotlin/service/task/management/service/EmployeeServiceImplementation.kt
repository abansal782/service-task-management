package service.task.management.service

import com.google.inject.Inject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import service.task.management.model.Employee
import service.task.management.repository.EmployeeRepository

@Service
class EmployeeServiceImplementation @Inject constructor (
    val employeeRepository: EmployeeRepository
) : EmployeeService {

    override fun findAll(): List<Employee> {
        return employeeRepository.findAll().toList()
    }

    override fun createEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    override fun getById(employee_id: String): Employee? {
        val employee = employeeRepository.findById(employee_id)
        if(employee.isPresent) {
            return null
        }

        return employee.get()
    }
}