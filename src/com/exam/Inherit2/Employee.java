package com.exam.Inherit2;

/*
 * 직장인클래스
 */

public class Employee extends Person {
	private String company;		// 회사명
	private String position;	// 직책
	
	public Employee(String name, int age, String gender, String company, String position) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setCompany(company);
		this.setPosition(position);
	}
	
	// getters and setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public void getInfo() {
		System.out.println("이름 : "+this.getName()+", 나이 : "+this.getAge()+", 성별 : "+this.getGender()+", 회사 : "+this.getCompany()+", 직책 : "+this.getPosition());
	}
	
}
