package day6;

public class ThisKeyword {
	
	int a, b; // Instance variable of class
	
	void getvalues(int a, int b) {   // method variables or external variables
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword kw = new ThisKeyword();
		
		kw.getvalues(4,  6);
		kw.display();

	}

}
