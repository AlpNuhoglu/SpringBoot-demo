package com.example.demo.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentConfig.class);

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            List<Student> students = getPredefinedStudents();
            repository.saveAll(students);
            LOGGER.info("Saved {} students to the database.", students.size());
        };
    }

    private List<Student> getPredefinedStudents() {
        return List.of(
                new Student("mariam", "mariam@gmail.com", LocalDate.of(2002, Month.JANUARY, 4)),
                new Student("alex", "alex@gmail.com", LocalDate.of(2000, Month.JANUARY, 8))
        );
    }
}