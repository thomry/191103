package com.exam.Inherit2;

public class Inherit {
	
	public static void main(String[] args) {
	
	// 다형성을 통한 객체 생성
	Person sp = new Student("홍길동", 500, "남자", "율도국", "교장");
	// 일반객체생성
	Employee ep = new Employee("고길동",40,"남자","삼성","부장");
	
	sp.getInfo();
	ep.getInfo();
	}
}
