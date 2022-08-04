package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.Model.Student;

public interface StudentServiceI {

	public Student saveStudentData(Student student);
	
	public List<Student> getAllData();
	
	public Student getByAge(Integer age);
}
