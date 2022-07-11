package service.task.management.service;

import service.task.management.model.Task;
import java.util.List;

public interface TaskService {

    List<Task> findAll();
}