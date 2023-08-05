package com.example.Elearning.Entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends User {
	
	
	
	@ManyToMany
	@JoinTable(
			name="student_course",
			joinColumns=@JoinColumn(name="student_id"),
			 inverseJoinColumns = @JoinColumn(name="course_id"))
	private List<Course> course ;
    
	
	
	

}
