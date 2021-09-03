package com.mypack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_no")
	private int id;
	
	@Column(name = "student_name")
	private String studentname;
	
	@Column(name = "student_dob")
	private String studentdob;
	
	@Column(name = "student_doj")
	private String studentdoj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentdob() {
		return studentdob;
	}

	public void setStudentdob(String studentdob) {
		this.studentdob = studentdob;
	}

	public String getStudentdoj() {
		return studentdoj;
	}

	public void setStudentdoj(String studentdoj) {
		this.studentdoj = studentdoj;
	}
}
