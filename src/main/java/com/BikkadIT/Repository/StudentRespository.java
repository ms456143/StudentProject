package com.BikkadIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Model.Student;

@Repository
public interface StudentRespository extends JpaRepository<Student, Integer>{

	public Student findByStudentAge(Integer Age);
}
