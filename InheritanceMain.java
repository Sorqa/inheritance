package com.test.sku.inheritance;

import java.util.ArrayList;
import java.util.List;



public class InheritanceMain {

	public static void main(String[] args) {
		//상속(Inheritance), 구현(implements)
		//MyClass extends Thread()   myclass가 더 큰거 왜 스레드를 상속했기 때문에
		//MyClass implements Runnable{}
		/*쉽게 하위 클레스를 파생하여 사용할 수 있다
		 * 클레스간의 관계(Parent/Child)를 설정할 수 있다
		 * IS-A Relationship(A is a B)
		 * A extends B(A는 B이다(o), B는 A이다(x));
		 * OOP 3대 특징(Inheritance, Polymorphism, Encapsulation) Polymorphism:다형성
		 */
		
		//inheritanceTest01();
		//inheritanceTest02();
		//inheritanceTest03();
		//inheritanceTest04();
		
		//상속성, 다형성, 은닉성
		//다형성: 오버라이드, 오버로드
		//은닉성: set,get
		
		/*Pet Store
		 * Cat,Dog, Snake, Hamster : Pet(float size,int price, String species)
		 * Cat(String pattern, float age, int price, String species)                       4.5개월 자식은 빼
		 * Dog(float weight, float age, int price, String species)
		 * Snake(String pattern, float size, int price, String species)
		 * Hamster(float size, int price, String species)
		 * 
		 * Pet 클레스 정의해보세요
		 * Cat, Dog, Snake, Hamster 파생하여 생성
		 * 자식 클래스의 인스턴스를 생성하고 한개의 Collection에 저장
		 * Collection의 내용을 화면에 표시해보세요
		 * OOP의 3대 특징이 잘 적용된 코드를 구현해보세요
		 * 
		 * Pet 관리 시스템
		 * 추가(a) : Cat(c), Dog(d), Snake(s), Hamster(h)
		 * 목록(s) : 품종 가격 나이 무늬 체중 길이
		 *    		
		*/
		//inheritanceTest05();
		boolean go = true;
		while(go)
		{
			String m = UserIO.showMenu();
			switch(m)
			{
				case "x": go=false; 		break;
				case "a": UserIO.add();		break;
				case "s": UserIO.list();	break;				
				
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
	
	/*
	private static void inheritanceTest05() {
		List<Pet> pet = new ArrayList<>();
		Cat cat = new Cat("줄무늬",6.5F,6000,"샴");
		Dog dog = new Dog(6.5F,1,50000,"말티즈");
		Snake snake = new Snake("점", 9.2F, 60200, "독사");
		Hamster hamster = new Hamster(0.2F, 200,"갈색");
		pet.add(cat);
		pet.add(dog);
		pet.add(snake);
		pet.add(hamster);
		
		System.out.println("\t***pet store***");
		for(int i =0; i < pet.size();i++) {
			System.out.println(pet.get(i));		
		}
	
		
	}*/
	private static void inheritanceTest04() {
		List<Item> cart = new ArrayList<>();	//상속을 해서 is a 관계
		Mouse mouse = new Mouse("하이텍광마우스","Hitec",15000,"2020-08-12","무선");
		Monitor monitor = new Monitor("삼성","samsung",30000,"2024-07-19",16.2F);
		
		cart.add(mouse);
		cart.add(monitor);
		for(int i =0; i < cart.size();i++) {
			System.out.println(cart.get(i));		
		}
		
	}
	private static void inheritanceTest03() {
		Monitor monitor = new Monitor("삼성","samsung",30000,"2024-07-19",16.2F); //F써야 flaot
		System.out.println(monitor);
		
	}
	private static void inheritanceTest02() {
		Mouse mouse = new Mouse("하이텍광마우스","Hitec",15000,"2020-08-12","무선");
		System.out.println(mouse);	//mouse.toString -> 4개 만나와
				
		
	}
	private static void inheritanceTest01() {
		Item item = new Item();
		
		item.setName("Memory");
		item.setMade("한국 Digital");
		item.setpDate("2020-11-20");
		item.setPrice(52000);
		
		System.out.println(item);
	}
}
