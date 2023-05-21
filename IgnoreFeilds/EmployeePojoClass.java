package IgnoreFeilds;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = {"fullname","firstname"})
public class EmployeePojoClass {
	
	private String firstname;
	private String lastname;
	private String gender;
	private int age;
	
	//@JsonIgnore
	//@JsonProperty(access = JsonProperty.Access.READ_ONLY )
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY )
	private double salary;
	private boolean isMarried;
	
	//@JsonIgnore
	private String fullname;
	
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public String getFullname() {
		return fullname;
	}
	
	

}
