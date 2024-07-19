package com.test.sku.inheritance;

public class Snake extends Pet {
	String pattern;

	public Snake() {}
	@Override
	public String toString() {
		String s= String.format("%s\t\t\t%.1f", pattern,size);
		
		return super.toString() + s;
	}

	public Snake(String pattern,float size,int price, String species) {
		super(size,price, species);
		setPattern(pattern);
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	
}
