package com.test.sku.inheritance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class UserIO {
	static Scanner kbd = new Scanner(System.in);
	static String menu = "추가(a) 목록(s)  종료(x):";
	static List<Pet> pet = new ArrayList<>();
	
	static String showMenu() {
		System.out.println();
		System.out.print(menu);
		String m = kbd.nextLine().trim();
		return m;
	}

	public static void add() {  
				
		System.out.print("추가할 동물 Cat(c),Dog(d),Snake(s),Hamster(h):");
		String a = kbd.nextLine().trim();
        switch(a)
        {
		case "c": cadd();       break;
		case "d": dadd();		break;
		case "s": sadd();	    break;				
		case "h": hadd();       break;
	     }
        
	}

	public static void list() 
	{	
		System.out.println("품종\t가격\t나이\t무늬\t체중\t길이");
		for(int i=0;i<pet.size();i++)
		{
			System.out.println(pet.get(i));
		}
	}
	
	public static void cadd() {  //cat
		System.out.print("품종:");
		String species = kbd.nextLine();
		
		System.out.print("가격:");
		int price = kbd.nextInt();    kbd.nextLine();
		
		System.out.print("나이:");
		float age = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("무늬:");
		String pattern = kbd.nextLine();
		
		System.out.print("체중:");
		float weight = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("길이:");
		float size = kbd.nextFloat(); kbd.nextLine();
		
		
		Cat cat = new Cat(pattern,age,size, price, species);
		pet.add(cat);
	}
	
	public static void dadd() {  //dog
		System.out.print("품종:");
		String species = kbd.nextLine();
		
		System.out.print("가격:");
		int price = kbd.nextInt();    kbd.nextLine();
		
		System.out.print("나이:");
		float age = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("무늬:");
		String pattern = kbd.nextLine();
		
		System.out.print("체중:");
		float weight = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("길이:");
		float size = kbd.nextFloat(); kbd.nextLine();
		
		
		Dog dog = new Dog(weight,age,size, price, species);
		pet.add(dog);
	}
	
	public static void sadd() {  //snake
		System.out.print("품종:");
		String species = kbd.nextLine();
		
		System.out.print("가격:");
		int price = kbd.nextInt();    kbd.nextLine();
		
		System.out.print("나이:");
		float age = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("무늬:");
		String pattern = kbd.nextLine();
		
		System.out.print("체중:");
		float weight = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("길이:");
		float size = kbd.nextFloat(); kbd.nextLine();
		
		
		Snake snake = new Snake(pattern,size,price, species);
		pet.add(snake);
	}
	
	public static void hadd() {  //hamster
		System.out.print("품종:");
		String species = kbd.nextLine();
		
		System.out.print("가격:");
		int price = kbd.nextInt();    kbd.nextLine();
		
		System.out.print("나이:");
		float age = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("무늬:");
		String pattern = kbd.nextLine();
		
		System.out.print("체중:");
		float weight = kbd.nextFloat(); kbd.nextLine();
		
		System.out.print("길이:");
		float size = kbd.nextFloat(); kbd.nextLine();
		
		
		Hamster hamster = new Hamster(size, price, species);
		pet.add(hamster);
	}
}
