package day8.AccessModifiers;

class A {
	
	private int x = 10;
	
	private void m1() {
		System.out.println(x);
	}
}

public class AccessModifiers_Private {
	public static void main(String args[]) {
		
		A a = new A();
		// a.x = 20;        ==> Compile time ERROR  -->   The field A.x is not visible
		// a.m1();          ==> Compile time ERROR   -->  The method m1() from the type A is not visible
		
		
		AA b = new AA();     // class defined in  AccessModifiers_default.java , this show default modifier accessible any where with in the package
		b.m1();
	}

}
