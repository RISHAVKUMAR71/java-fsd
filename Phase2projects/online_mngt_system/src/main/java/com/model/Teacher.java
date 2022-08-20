package com.model;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tec_data")
public class Teacher {

	// properties
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="subject")
	private String subject;
	
	
	// constructor
	public Teacher() {}
	
	public Teacher(int id) {
		this.id = id;
	}
	
	public Teacher(String name,String email,String subject) {
		super();
		this.name = name;
		this.email = email;
		this.subject=subject;

	}

	public Teacher(int id, String name,String email,String subject) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject=subject;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ",Email=" + email + "]";
				 
	}

}