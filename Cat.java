package com.test.sku.inheritance;

public class Cat extends Pet {
	String pattern;
	float age;
	
	public Cat() {}

	@Override
	public String toString() {
		String s= String.format("%.1f\t%s\t\t%.1f", age,pattern,size);//\t\t는 체중
		
		return  super.toString()+ s;
		
	}
	

	public Cat(String pattern,float age,float size, int price, String species) {
		super(size,price, species);
		setPattern(pattern);
		setAge(age);
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
}
