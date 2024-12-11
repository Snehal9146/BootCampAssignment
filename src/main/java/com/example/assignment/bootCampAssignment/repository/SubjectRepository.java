package com.example.assignment.bootCampAssignment.repository;

import com.example.assignment.bootCampAssignment.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
