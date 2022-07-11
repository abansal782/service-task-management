package service.task.management.service;

import service.task.management.model.Task;
import service.task.management.repository.TaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImplementation implements TaskService {

    @Autowired
    private TaskRepository repository;

    @Override
    public List<Task> findAll() {

        List<Task> tasks = (List<Task>)repository.findAll();

        return tasks;
    }
}