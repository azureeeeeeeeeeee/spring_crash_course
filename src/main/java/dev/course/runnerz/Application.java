package dev.course.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import dev.course.runnerz.run.Run;
import dev.course.runnerz.run.Location;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        logger.info("Application Started Successfully");
        System.out.println("Application Started Successfully");
	}

    @Bean
    CommandLineRunner runner() {
        return args -> {
            Run run = new Run(
                    1,
                    "Morning Run",
                    LocalDateTime.now().minusHours(1),
                    LocalDateTime.now(),
                    5,
                    Location.OUTDOOR);
            logger.info("Run Object: {}", run);
            System.out.println(run);
        };
    }

}
