package day7;

class C extends B{
	
	int c;
	
	void show() {
		System.out.println(c);
	}
}
public class MultipleInheritance {
public static void main(String args[]) {
		
		A obj1 = new A();
		obj1.a = 100;
		obj1.display();
		
		B obj2 = new B();
		obj2.a = 10;
		obj2.b = 20;
		obj2.display();
		obj2.printval();
		
		C obj3 = new C();
		obj3.a = 111;
		obj3.b = 222;
		obj3.c = 333;
		obj3.display();
		obj3.printval();
		obj3.show();
	}

}
