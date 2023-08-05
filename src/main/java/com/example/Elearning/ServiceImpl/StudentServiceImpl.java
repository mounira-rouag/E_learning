package com.example.Elearning.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elearning.Entites.Student;
import com.example.Elearning.Repository.StudentRepository;
import com.example.Elearning.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudentProfile(Student student,Integer id) {
		// TODO Auto-generated method stub
		Student std=studentRepo.findById(id).get();
		std.setNom(student.getNom());
		
		std.setEmail(student.getEmail());
		std.setPassword(student.getPassword());
		std.setConfirmpassword(student.getConfirmpassword());
		std.setAdresse(student.getAdresse());
		std.setTel(student.getTel());
		
		return studentRepo.saveAndFlush(std) ;
	}

	@Override
	public Student findStudfentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public String addCpassword(Student student) {
		// TODO Auto-generated method stub
		String ch="";
		if(!(student.getConfirmpassword()!= null && student.getConfirmpassword().equals(student.getPassword())))
			ch="veuillez verifier le mote de passe ";
		else {
			studentRepo.save(student);
		ch="student added succesfully";
		}
		return ch;
		
	}

	@Override
	public String addStudentWtun(Student student) {
		// TODO Auto-generated method stub
		String ch="";
		if(studentRepo.existsByEmail(student.getEmail())) {
			ch="user already exist";
		
		}
		else {
			studentRepo.save(student);
			ch="user added succefully";
		}
		return ch;
	}

	@Override
	public String deletStudent(Integer id) {
		// TODO Auto-generated method stub
		String ch="";
		studentRepo.deleteById(id);
		ch="student deleted sucssefully";
		return ch;
	}

	@Override
	public List<Student> getAllStudentswithch(String ch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		 	return studentRepo.findByEmailAndPassword(email, password);
	}
	
	
}
