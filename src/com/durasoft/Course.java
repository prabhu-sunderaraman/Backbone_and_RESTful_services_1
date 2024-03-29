package com.durasoft;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Course(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public Course() {
	}
}
