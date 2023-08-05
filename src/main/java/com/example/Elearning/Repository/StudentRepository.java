package com.example.Elearning.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Elearning.Entites.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
	boolean existsByEmail(String email);
	
	@Query(value="select prenom form Student s where s.prenom like :cle%",nativeQuery=true)
	public List<Student> getStudentsStartWsc(@Param ("cle") String ch);
	
	public Student findByEmailAndPassword(String email, String password);
}