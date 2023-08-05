package com.example.Elearning.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chapitre {
	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	private Integer level;
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

}
