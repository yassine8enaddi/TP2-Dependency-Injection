package com.example.tp2;

import com.example.tp2.model.Student;
import com.example.tp2.service.StudentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.tp2");
        StudentService studentService = context.getBean(StudentService.class);
        studentService.create(new Student(5, "Nom5", "Prenom5", "filiere5"));
        System.out.println();
        studentService.afficherListeEtudiants();
        System.out.println();
        Optional<Student> student = studentService.rechercherParCNE(3);
        student.ifPresent(value -> System.out.println("CNE: " + value.getCNE() + "\nNOM: " + value.getNom() + "\nPRENOM: " + value.getPrenom() + "\nFILIERE: " + value.getFiliere()));
    }
}
