package com.BikkadIT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Model.Student;
import com.BikkadIT.Repository.StudentRespository;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StudentRespository studentRespository;

	@Override
	public Student saveStudentData(Student student) {
		Student save = studentRespository.save(student);
		return save;
	}

	@Override
	public List<Student> getAllData() {
		List<Student> list = (List<Student>) studentRespository.findAll();
		return list;
	}

	@Override
	public Student getByAge(Integer age) {
		Student findByStudentAge = studentRespository.findByStudentAge(age);
		return findByStudentAge;
	}
	
	
	
}
