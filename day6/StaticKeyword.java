package day6;
class StaticOutsideClass{
	
	static int c = 30;
	
	static void m3() {
		System.out.println("m3(): This is a static method outside the main class");
	}
}

public class StaticKeyword {
	
	static int a = 10; // this is a static variable
	int b = 20;        // this is a non-static variable
	
	static void m1() {
		StaticKeyword sk1 = new StaticKeyword();
		System.out.println("b print by method m1: "+sk1.b); // Since b is non static therefore object need to create so that static method access non static variable
		
		System.out.println("m1(): This is a static method");
	}
	
	void m2() {
		System.out.println("m2(): This is non-static method");
	}
	
	void m4() {
		System.out.println("m4(): *****************This is non-static method**********");
		System.out.println("a print by method m4: "+a);
		System.out.println("b print by method m4: "+b);
		m1();
		m2();
	}
	
	public static void main(String args[]) {
		System.out.println(a); // static method (i.e. main()) directly access static variable
		m1();                  // static method (i.e. main()) directly access static method
		
		System.out.println(StaticKeyword.a);
		StaticKeyword.m1();
		
		System.out.println(StaticOutsideClass.c);
		StaticOutsideClass.m3();
		
		
		//System.out.println(b);  gives ERROR, b is non static
		//m2();                   gives ERROR, m2() is non static
		
		// static methods can also access non static stuff but through object
		StaticKeyword sk = new StaticKeyword();
		System.out.println(sk.b);  // static method (i.e. main()) access non static variable
		sk.m2();                   // static method (i.e. main()) access non static method
		sk.m4();
	}

}
