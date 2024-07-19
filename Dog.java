package com.test.sku.inheritance;

public class Dog extends Pet {
	float weight;
	float age;
	
	public Dog() {}
	@Override
	public String toString() {
		String s= String.format("%.1f\t\t%.1f\t%.1f", age,weight,size);
		
		return super.toString() + s;
	}
	public Dog(float weight,float age,float size, int price, String species) {
		super(size,price, species);
		setWeight(weight);
		setAge(age);
		
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
	
}
