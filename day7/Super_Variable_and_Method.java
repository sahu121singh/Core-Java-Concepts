package day7;

class Animal{
	
	String color = "White";
	
	void eating() {
		System.out.println("Eating............");
	}
}

class Dog extends Animal{
	String color = "Black";
	
	void display() {
		System.out.println(color);
		System.out.println(super.color);   // belongs to immediate parent class
	}
	
	void eating() {
		System.out.println("Eating Bread............");
		super.eating();           // invoke immediate parent class method
	}
	
	//super.eating; --> error
}

public class Super_Variable_and_Method {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.display();
		
		d.eating();

	}

}
