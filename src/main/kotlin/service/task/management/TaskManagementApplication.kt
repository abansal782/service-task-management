package service.task.management

import dev.misfitlabs.kotlinguice4.KotlinModule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import service.task.management.service.ServiceModule

@SpringBootApplication
class TaskManagementApplication: KotlinModule() {
    override fun configure() {
        install(ServiceModule())
    }
}

fun main(args: Array<String>) {
    runApplication<TaskManagementApplication>(*args)
}
