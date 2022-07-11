package service.task.management.repository;

import org.springframework.data.repository.CrudRepository;
import service.task.management.model.Employee;

import java.util.UUID;

public interface EmployeeRepository extends CrudRepository<Employee, UUID> {
}
