package ma.xproce.student;

import ma.xproce.student.dao.entities.Student;

import ma.xproce.student.dao.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentRepository studentRepository){
        return  args -> {

            List<Student> students = List.of(
                    Student.builder().name("model1").dateNaissance("2000-01-01").email("model1@example.com").build(),
                    Student.builder().name("model2").dateNaissance("2001-02-02").email("model2@example.com").build(),
                    Student.builder().name("model3").dateNaissance("2002-03-03").email("model3@example.com").build(),
                    Student.builder().name("model4").dateNaissance("2003-04-04").email("model4@example.com").build()
            );

            studentRepository.saveAll(students);
        };



//
        };
    }

