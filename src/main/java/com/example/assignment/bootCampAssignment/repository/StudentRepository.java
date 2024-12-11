package com.example.assignment.bootCampAssignment.repository;

import com.example.assignment.bootCampAssignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
