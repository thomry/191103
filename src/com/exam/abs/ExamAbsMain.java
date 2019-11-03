package com.exam.abs;

import java.util.Scanner;

public class ExamAbsMain {
	
	public static TV assemble(String type) {
		SamsungTV sTV = null;
		LgTV      lTV = null;
		
		if (type.equals("samsung")) {
			sTV = new SamsungTV();
			sTV.setProductNo("s101010");
			sTV.setName("삼성 커브드 27인치");
			sTV.setPixels("FHD");
			
			return sTV;
		}
		else if (type.contentEquals("lg")) {
			lTV = new LgTV();
			lTV.setProductNo("100100");
			lTV.setName("LG UHD TV");
			lTV.setPixels("UHD");
			
			return lTV;
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String type = null;
		System.out.println("생성할 tv 제조사 입력 : ");
		type = scn.nextLine();
		TV tv = ExamAbsMain.assemble(type);
		if( tv != null) {
			tv.getInfo();
		}
		else {
			System.out.println("해당 제조사가 없습니다.");
		}
		scn.close();
	}

}
