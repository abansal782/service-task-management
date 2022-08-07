package service.task.management.service

import dev.misfitlabs.kotlinguice4.KotlinModule

class ServiceModule: KotlinModule() {
    override fun configure() {
        bind<EmployeeService>().to<EmployeeServiceImplementation>()
        bind<TaskService>().to<TaskServiceImplementation>()
    }
}