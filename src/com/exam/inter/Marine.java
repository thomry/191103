package com.exam.inter;

public class Marine implements Unit {
	
	private String name;
	private int    hp;
	private int    xPos;
	private int    yPos;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	@Override
	public void attack() {
		System.out.println(this.getName()+"마린이 공격합니다!!");		
	}

	@Override
	public void move() {
		this.xPos += 10;
		this.yPos += 10;		
	}

	@Override
	public void getInfo() {
		System.out.println("마린 : "+this.getName()+" | HP : "+this.getHp()+" | 위치 : "+this.getxPos()+", "+this.getyPos());
	}
	
	

}
