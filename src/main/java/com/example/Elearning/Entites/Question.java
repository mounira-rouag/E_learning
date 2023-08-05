package com.example.Elearning.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int number;
	private String question;
	private double note;
	@ManyToOne
	@JoinColumn(name="test_id")
	private Test test;
}
