package day7;

class Parent{
	
	int a;
	
	void display() {
		System.out.println(a);
	}
}

class Child1 extends Parent{
	
	int x;
	
	void show1() {
		System.out.println(x);
	}
}

class Child2 extends Parent{
	
	int y;
	
	void show2() {
		System.out.println(y);
	}
}
public class Hierarchical_Inheritance {
	public static void main(String args[]) {
		Parent p = new Parent();
		p.a = 1111;
		p.display();
		
		Child1 c1 = new Child1();
		c1.a = 22222222;
		c1.x = 2222;
		c1.display();
		c1.show1();
		
		Child2 c2 = new Child2();
		c2.a = 33333333;
		c2.y = 3333;
		c2.display();
		c2.show2();
	}

}
