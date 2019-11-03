package com.exam.Inherit2;

public class Person {
	
	private String name;
	private int    age;
	private String gender;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// 정보출력 method
	public void getInfo() {
		System.out.println("이름 : "+this.getName()+", 나이 : "+this.getAge()+", 성별 : "+this.getGender());
	}
}
