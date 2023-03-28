package com.demo.RestApplication;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Super_Class 
{
	public String id;
	public String name;
	public String course;
	public String college;
	
	public Super_Class(String id, String name, String course, String college) 
	{
		this.id = id;
		this.name = name;
		this.course = course;
		this.college = college;
	}
	
	public Super_Class() {
		// TODO Auto-generated constructor stub
	}
}
