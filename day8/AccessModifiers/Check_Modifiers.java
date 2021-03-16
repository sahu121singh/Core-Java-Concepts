package day8.AccessModifiers;

public class Check_Modifiers {
	public static void main(String args[]) {
		
		A a = new A();
		//a.m1();          ==> Compile time ERROR --> m1() is private method of class A
		
		
		AA aa = new AA();
		aa.m1();
		aa.x = 234;
		aa.m1();
		
		AAA aaa = new AAA();
		aaa.m1();
		aaa.x = 345;
		aaa.m1();
		
		
	}

}
