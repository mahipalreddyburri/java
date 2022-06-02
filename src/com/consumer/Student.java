package com.consumer;

import java.util.List;

public class Student {
 private String name;
 private int gradelevel;
 private double gpa;
 private String gender;
 private List<String>activity;
 private int textbooks;

public Student() {
	super();
}

public Student(String name) {
	super();
	this.name = name;
}

public Student(String name, int gradelevel, double gpa, String gender, List<String> activity,int textbooks) {
	super();
	this.name = name;
	this.gradelevel = gradelevel;
	this.gpa = gpa;
	this.gender = gender;
	this.activity = activity;
	this.textbooks=textbooks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGradelevel() {
	return gradelevel;
}
public void setGradelevel(int gradelevel) {
	this.gradelevel = gradelevel;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

public void listOfActivities() {
	System.out.println(activity);
}

public List<String> getActivity() {
	return activity;
}
public void setActivity(List<String> activity) {
	this.activity = activity;
}

public int getTextbooks() {
	return textbooks;
}

public void setTextbooks(int textbooks) {
	this.textbooks = textbooks;
}

@Override
public String toString() {
	return "Student [name=" + name + ", gradelevel=" + gradelevel + ", gpa=" + gpa + ", gender=" + gender
			+ ", activity=" + activity + ", textbooks=" + textbooks + "]";
}



 
	
}
