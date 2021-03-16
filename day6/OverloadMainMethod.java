package day6;

public class OverloadMainMethod {
	public void main(int a, int b) {
		System.out.println(a+b);
	}
	public void main(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String args[]) {
		OverloadMainMethod mm = new OverloadMainMethod();
		mm.main(5, 10);
		mm.main(3, 4, 2);
	}

}
