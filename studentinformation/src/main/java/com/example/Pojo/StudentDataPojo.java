package com.example.Pojo;

public class StudentDataPojo {
	private int id;
	private String fname; 
	private String lname;
	private String course;
	private String phone;
	
	public StudentDataPojo() {
		
	}
	
	public StudentDataPojo(String fname, String lname, String course, String phone) {
		super();
		this.fname=fname;
		this.lname=lname;
		this.course=course;
		this.phone=phone;
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
