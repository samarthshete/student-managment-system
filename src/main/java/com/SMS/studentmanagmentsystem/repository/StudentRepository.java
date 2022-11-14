package com.SMS.studentmanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SMS.studentmanagmentsystem.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {



}
