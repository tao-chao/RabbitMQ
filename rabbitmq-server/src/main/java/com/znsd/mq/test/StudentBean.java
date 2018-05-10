package com.znsd.mq.test;

import java.io.Serializable;

public class StudentBean implements Serializable{
	
	private int id;
	private String name;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	public StudentBean(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
