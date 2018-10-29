package pojo;

import java.io.Serializable;

public class Student implements Serializable {

	private String name,gender;
	private Integer age,standard;
	
	
	public Student(String name, String gender, Integer age, Integer standard) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.standard = standard;
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


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getStandard() {
		return standard;
	}


	public void setStandard(Integer standard) {
		this.standard = standard;
	}
	
	
}
