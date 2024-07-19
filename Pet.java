package com.test.sku.inheritance;

public class Pet {
	float size;
	int price; 
	String species;
	
	public Pet() {}

	public Pet(float size, int price, String species) {
		//super();
		this.size = size;
		this.price = price;
		this.species = species;
	}


	public Pet(int price, String species) {
		this.price = price;
		this.species = species;
	}

	@Override
	public String toString() {
		
		return String.format("%s\t%,d\t",species,price);
		
	}

	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
}
