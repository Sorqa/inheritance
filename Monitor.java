package com.test.sku.inheritance;

import java.text.DecimalFormat;
import java.util.Date;

public class Monitor extends Item{
	float size;

	public Monitor() {}
	public Monitor(String name, String made, int price, Date pDate, float size) {
		super(name, made, price, pDate);	//부모의 생성자를 빌려서 쓴다 부모한테 보내서 초기화를 시킨다 상위 클레스 참조
		setSize(size);
	}
	public Monitor(String name, String made, int price, String sDate, float size) {
		super(name, made, price, sDate);	
		setSize(size);
	}
	@Override
	public String toString() {	
		//DecimalFormat df = new DecimalFormat("##.#");
		//String ssize = df.format(size);
		return super.toString() + "\t" + size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
}
