package com.exam.abs;

public class LgTV extends TV{
	
	private String pixels;
	private String assemble;

	

	public String getPixels() {
		return pixels;
	}

	public void setPixels(String pixels) {
		this.pixels = pixels;
	}

	public String getAssemble() {
		return assemble;
	}

	public void setAssemble(String assemble) {
		this.assemble = assemble;
	}

	@Override
	public void turnOnTV() {
		System.out.println("LG TV Turn On");
	}
	@Override
	public void turnOffTV() {
		System.out.println("LG TV Turn Off");
	}
	@Override
	public void getInfo() {
		String info = null;
		info = "LG TV, No: "+this.getProductNo()+", 모델명 : "+this.getName()+", 인치 : "+this.getInch()+
				", 픽셀 : "+this.getPixels()+", assemble: "+this.getAssemble();
		System.out.println(info);
	}
	
	
	
	

}
