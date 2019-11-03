package com.exam.Inherit2;

public class Student extends Person{
	
	private String school;	// 학교이름
	private String grade;	// 학년
	
	public Student(String name, int age, String gender, String school, String grade) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setSchool(school);
		this.setGrade(grade);
	}
	
	// source - generate getters and setters - check all - public - generate
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	// source - override/implement methods... - 만들 override check
	@Override
	public void getInfo() {
		System.out.println("이름 : "+this.getName()+", 나이 : "+this.getAge()+", 성별 : "+this.getGender()+", 학교 : "+this.getSchool()+", 학년 : "+this.getGrade());
	}
	
	
}
