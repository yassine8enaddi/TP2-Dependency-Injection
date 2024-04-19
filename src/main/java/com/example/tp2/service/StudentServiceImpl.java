package com.example.tp2.service;

import com.example.tp2.model.Student;
import com.example.tp2.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> rechercherParCNE(Integer cne) {
        return studentRepository.findById(cne);
    }

    @Override
    public void afficherListeEtudiants() {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            System.out.println("CNE: " + student.getCNE() + "\nNOM: " + student.getNom() + "\nPRENOM: " + student.getPrenom() + "\nFILIERE: " + student.getFiliere());
        }
    }
}
