package service.task.management.service

import com.google.inject.Inject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import service.task.management.model.Task
import service.task.management.repository.TaskRepository

@Service
class TaskServiceImplementation @Inject constructor(
    val taskRepository: TaskRepository
) : TaskService {
    override fun findAll(): List<Task> {
        return taskRepository.findAll().toList()
    }

    override fun createTask(task: Task): Task {
        return taskRepository.save(task)
    }
}