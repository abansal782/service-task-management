package service.task.management;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TaskManagementApplication {

	public static void main(String[] args) {
		log.info("Application started");

		SpringApplication.run(TaskManagementApplication.class, args);
	}

}
