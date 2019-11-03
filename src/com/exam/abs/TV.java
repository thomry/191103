package com.exam.abs;

public abstract class TV {
	
	private String productNo;	// 상품번호
	private String name;		// 모델명
	private int    inch;		// 크기
	
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	// 추상화 method 생성
	public abstract void turnOnTV();
	public abstract void turnOffTV();
	
	public void getInfo() {
		String info = null;
		info = "Samsung TV, No: "+this.getProductNo()+", 모델명 : "+this.getName()+", 인치 : "+this.getInch();
		System.out.println(info);
	}
	
	
}
