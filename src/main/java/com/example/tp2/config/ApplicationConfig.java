package com.example.tp2.config;

import com.example.tp2.repository.InMemoryStudentRepository;
import com.example.tp2.repository.StudentRepository;
import com.example.tp2.service.StudentService;
import com.example.tp2.service.StudentServiceImpl;
//import com.example.tp2.service.StudentServiceMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    StudentRepository StudentRepository() {
        return new InMemoryStudentRepository();
    }

    @Bean
    StudentService StudentService() {
        return new StudentServiceImpl(StudentRepository());
    }

//    @Bean
//    StudentService StudentService() {
//        return new StudentServiceMock();
//    }
}
