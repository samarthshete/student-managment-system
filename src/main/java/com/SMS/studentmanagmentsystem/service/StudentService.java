package com.SMS.studentmanagmentsystem.service;

import java.util.List;

import com.SMS.studentmanagmentsystem.model.Student ;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);

	List<Student> getByKeyword(String keyword);
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
