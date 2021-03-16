package day8;

class A1 {
	
	void m1() {
		System.out.println("This is m1 method from A1 class");
	}
}

interface B1 {
	
	void m2();
}

interface B2 {
	void m3();
}

//public class Hybrid_Inheritance implements B1, B2 extends A1  =>  ERROR

public class Hybrid_Inheritance extends A1 implements B1, B2 {
	
	public void m2() {
		System.out.println("This is m2 method from B1 interface");
	}
	
	public void m3() {
		System.out.println("This is m3 method from B2 interface");
	}
	
	public static void main(String args[]) {
		
		Hybrid_Inheritance hb = new Hybrid_Inheritance();
		
		hb.m1();
		hb.m2();
		hb.m3();
		
		B1 b = new Hybrid_Inheritance();
		b.m2();
		// b.m1();   ==> ERROR
		// b.m3();   ==> ERROR   ==> The method m3() is undefined for the type B1
	}

}
