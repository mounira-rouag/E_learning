package com.example.Elearning.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elearning.Entites.Student;
import com.example.Elearning.ServiceImpl.StudentServiceImpl;
@RestController
public class LoginController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	
	@PostMapping("/loginstudent")
	
	public Student loginUser(@RequestBody Student student) throws Exception
	{
		String currEmail = student.getEmail();
		String currPassword = student.getPassword()	;
		
		Student userObj = null;
		if(currEmail != null && currPassword != null)
		{
			userObj = studentServiceImpl.findByEmailAndPassword(currEmail, currPassword);
		}
		if(userObj == null)
		{
			throw new Exception("User does not exists!!! Please enter valid credentials...");
		}		
		return userObj;
	}
}
