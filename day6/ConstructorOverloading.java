package day6;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a, int b) {
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a, double b) {
		System.out.println(a+b);
	}
	
	ConstructorOverloading(double a, double b) {
		System.out.println(a+b);
	}
	
	
	ConstructorOverloading(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	void display() {
		System.out.println("Done");
	}
	
	public static void main(String args[]) {
		ConstructorOverloading mo = new ConstructorOverloading(10, 5);
		mo.display();
		ConstructorOverloading mo_1 = new ConstructorOverloading(10, 5.55555);
		mo_1.display();
		ConstructorOverloading mo_2 = new ConstructorOverloading(10.999, 5.834);
		mo_2.display();
		ConstructorOverloading mo_3 = new ConstructorOverloading(10, 5, 20);
		mo_3.display();
	}
}
