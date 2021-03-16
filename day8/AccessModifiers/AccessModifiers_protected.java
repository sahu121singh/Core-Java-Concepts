package day8.AccessModifiers;

class AAA {
	
	protected int x = 10898;
	
	protected void m1() {
		System.out.println(x);
	}
}

public class AccessModifiers_protected {
	
	protected int xxx = 1080;
	
	protected void method1() {
		System.out.println(xxx);
	}
	
	public static void main(String args[]) {
		
		AAA a = new AAA();
		a.x = 200;
		a.m1();
	}

}