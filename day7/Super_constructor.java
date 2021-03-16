package day7;

class Animal1{
	
	String color = "White";
	
	Animal1(){
		System.out.println("Animal class Constructor");
	}
}

class Dog1 extends Animal1{
	String color = "Black";
	
	Dog1(){
		super();       // invoke immediate parent class constructor
		
		//************************************************************************************************************
		// Although result will be same without invoking parent class constructor, but internal mechanism is different.
		//************************************************************************************************************
		System.out.println("Dog class Constructor");
	}
}

public class Super_constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog1 d = new Dog1();
		
		System.out.println(d.color);

	}
}
