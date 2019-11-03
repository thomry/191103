package com.exam.inter;

public class StarMain {
	public static void main(String[] args) {
		
		Marine uM = new Marine();
		
		uM.setName("마카롱");
		uM.setHp(500);
		uM.setxPos(10);
		uM.setyPos(10);
		
		uM.attack();
		uM.move();
		uM.getInfo();

	}

}
