package day8.AccessModifiers;

class AA {
	
	int x = 1000;
	
	void m1() {
		System.out.println(x);
	}
}

public class AccessModifiers_default {
	public static void main(String args[]) {
		
		AA a = new AA();
		a.x = 20;
		a.m1();
	}

}