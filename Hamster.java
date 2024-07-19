package com.test.sku.inheritance;

public class Hamster extends Pet {

	public Hamster() {}
	public Hamster(float size, int price, String species) {
		super(size, price, species);
		
	}

	@Override
	public String toString() {
		String s= String.format("%.1f", size);
		return super.toString()+s;
	}

	
}
