package com.exam.inter;

public interface Unit {
	
	public abstract void attack();
	
	/*
	 * 인터페이스의 모든 method는 public abstract keyword가 
	 * 붙기때문에 생략도 가능
	 */
	
	void move();
	
	void getInfo();
	
	/*
	 * interface는 자체로 객체로서 존재할 수 없으므로
	 * 변수는 무조건 상수(public static final...)만 가질 수 있음
	 * 단, public static final이 생략가능.
	 * interface는 무조건 상수만 가능하므로 생략가능함.
	 * private int hp = 0; (x)
	 * int hp = 0; (o)
	 */
	
	public static final double PI = 3.14;
	int POS = 0;		// public static final 이 생략된 형

}
