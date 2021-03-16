package day7;

class A{
	
	int a;
	
	void display() {
		System.out.println(a);
	}
}


class B extends A{
	
	int b;
	
	void printval(){
		System.out.println(b);
	}
}

public class SingleInheritance {
	public static void main(String args[]) {
		
		A obj1 = new A();
		obj1.a = 100;
		obj1.display();
		
		B obj2 = new B();
		obj2.a = 10;
		obj2.b = 20;
		obj2.display();
		obj2.printval();
	}

}
