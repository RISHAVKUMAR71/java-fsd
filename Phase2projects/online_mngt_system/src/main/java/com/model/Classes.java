package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="classes_data")

public class Classes {
	
	// properties
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
	private int  id;
		
	@Column(name="classname")
	private String classname;
	
	
	@Column(name="section")
	private String section;
	
	
	public Classes(int id) {
		super();
		this.id = id;
	}


	public Classes() {
		super();
	}


	public Classes(String classname, String section) {
		super();
		this.classname = classname;
	
		this.section = section;
	}


	public Classes(int id, String classname, String section) {
		super();
		this.id = id;
		this.classname = classname;
	
		this.section = section;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	@Override
	public String toString() {
		return "Classes [id=" + id + ", classname=" + classname + ", section=" + section + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}