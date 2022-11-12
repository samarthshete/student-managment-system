package com.SMS.studentmanagmentsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SMS.studentmanagmentsystem.model.Student ;
import com.SMS.studentmanagmentsystem.repository.StudentRepository ;
import com.SMS.studentmanagmentsystem.service.StudentService ;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
//	public List<Student> getAllStudents() {
//		return studentRepository.findAll();
//	}
	public List<Student> getAllStudents(){
		List<Student> list =  (List<Student>)studentRepository.findAll();
		return list;
	}
	@Override
	public List<Student> getByKeyword(String keyword){
		return studentRepository.findByKeyword(keyword);
	}
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
