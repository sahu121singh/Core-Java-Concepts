package day5;

public class Constructors{
	int x;
	int y;
	
	Constructors(){         // default constructor
		x = 5;
		y = 10;
	}

	Constructors(int a, int b){   // Parameterized Constructor
		x = a;
		y = b;
	}
	
	void display() {
		System.out.println(x+"        "+y);
	}
	
	public static void main(String args[]) {
		
		Constructors c = new Constructors();
		c.display();
		
		Constructors cm = new Constructors(3, 7);
		cm.display();
	}
}
