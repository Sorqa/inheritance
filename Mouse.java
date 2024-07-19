package com.test.sku.inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mouse extends Item {	//Item class에 있는 모든게 가져올수 있음,생성자는 상속이 안됨
	String wireless;
	
	public Mouse() {
		
	}


	@Override
	public String toString() {
        
		return super.toString()+"\t"+wireless;
		
	}


	public Mouse(String name, String made, int price, Date pDate, String wireless) {
		super(name, made, price, pDate);	//부모의 생성자를 빌려서 쓴다 부모한테 보내서 초기화를 시킨다 상위 클레스 참조
		setWireless(wireless);
	}
	public Mouse(String name, String made, int price, String sDate, String wireless) {
		super(name, made, price, sDate);	//부모의 생성자를 빌려서 쓴다 부모한테 보내서 초기화를 시킨다 상위 클레스 참조
		setWireless(wireless);
	}

	public String getWireless() {
		return wireless;
	}

	public void setWireless(String wireless) {
		this.wireless = wireless;
	}
	
}
