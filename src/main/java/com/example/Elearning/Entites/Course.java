package com.example.Elearning.Entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	private String coursename;
	private String courseid;
	private String coursedate;
	private int price;
	@OneToOne
	@JoinColumn(name="profssor_id")
	private Professor professor;
	
	private String Programme;
	private int skilllevels;
	private String language;
	private String description;
	
	@OneToMany(mappedBy="course")
	private List<Chapitre> chaptires;
	
	@ManyToMany(mappedBy="course")
	private List<Student> students;

	public Course(int id, String coursename, String courseid, String coursedate, int price, Professor professor,
			String programme, int skilllevels, String language, String description, List<Chapitre> chaptires,
			List<Student> students) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.courseid = courseid;
		this.coursedate = coursedate;
		this.price = price;
		this.professor = professor;
		Programme = programme;
		this.skilllevels = skilllevels;
		this.language = language;
		this.description = description;
		this.chaptires = chaptires;
		this.students = students;
	}

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getCoursedate() {
		return coursedate;
	}

	public void setCoursedate(String coursedate) {
		this.coursedate = coursedate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getProgramme() {
		return Programme;
	}

	public void setProgramme(String programme) {
		Programme = programme;
	}

	public int getSkilllevels() {
		return skilllevels;
	}

	public void setSkilllevels(int skilllevels) {
		this.skilllevels = skilllevels;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Chapitre> getChaptires() {
		return chaptires;
	}

	public void setChaptires(List<Chapitre> chaptires) {
		this.chaptires = chaptires;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
