package com.gmail.ps.allllll;
import java.io.Serializable;

public class Student extends Human implements Serializable {
	private int numberZ;
	private int absence;
	private int course;
	private String group;

	public Student(String name, String surname, int age, boolean sex, int numberZ, int absence, int course,
			String group) {
		super(name, surname, age, sex);
		this.numberZ = numberZ;
		this.absence = absence;
		this.course = course;
		this.group = group;
		
		if (course >= 1 && course <= 6) 
			this.course = course;
		else
			System.out.println("This course does not exist!");
	}

	public Student(String name, String surname, int age, boolean sex) {
		super(name, surname, age, sex);
	}

	public int getNumberZ() {
		return numberZ;
	}

	public void setNumberZ(int numberZ) {
		this.numberZ = numberZ;
	}

	public int getAbsence() {
		return absence;
	}

	public void setAbsence(int absence) {
		this.absence = absence;
	}

	public int getCourse() {

		return course;
	}

	public void setCourse(int course) {
		if (course >= 1 && course <= 6) {
			this.course = course;
		} else
			System.out.println("This course does not exist!");
		}
	

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		if(group!=null) {
		this.group = group;
	
	}}
	@Override
	public String toString() {
		return super.toString()+"|"+"numberZ:"+ + numberZ + "|absence:" + absence + "|course:" + course + "| group:" + group+";" ;
	}

	
	}


