package service.task.management.service

import service.task.management.model.Task

interface TaskService {
    fun findAll(): List<Task>

    fun createTask(task: Task): Task
}