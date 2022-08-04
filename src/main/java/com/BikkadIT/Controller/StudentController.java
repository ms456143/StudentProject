package com.BikkadIT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.Model.Student;
import com.BikkadIT.Service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	@GetMapping(value="/save",produces = "application/json",consumes = "application/json")
	public ResponseEntity<Student> SaveStudentData(@RequestBody Student student) {
		System.out.println(student);
		Student saveStudentData = studentServiceI.saveStudentData(student);
		return new ResponseEntity<>(saveStudentData,HttpStatus.OK);	
	}
	
	@GetMapping("/getAllData")
	public ResponseEntity<List<Student>> getAllData(){
		List<Student> allData = studentServiceI.getAllData();
		return new ResponseEntity<>(allData,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/findByAge/{age}")
	public ResponseEntity<Student> getByAge(@PathVariable Integer age) {
		System.out.println(age);
		Student byAge = studentServiceI.getByAge(age);
		return new ResponseEntity<>(byAge,HttpStatus.OK);
		
		
	}
	
}
