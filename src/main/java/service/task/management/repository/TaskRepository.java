package service.task.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import service.task.management.model.Task;

import java.util.UUID;

@Repository
public interface TaskRepository extends CrudRepository<Task, UUID> {

}