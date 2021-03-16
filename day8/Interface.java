package day8;

interface A{
	
	int a = 11; // by default variables in interface are static and final
	
	void m1(); // by default method in interface is Public
}

public class Interface implements A {
	
	public void m1() {
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		
		Interface obj = new Interface();
		obj.m1();
		//System.out.println(obj.a);
		
		A obj2 = new Interface();
		obj2.m1();
		//System.out.println(obj2.a);
	}

}
