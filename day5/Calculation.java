package day5;

public class Calculation {
	int x = 10;
	int y = 15;
	
	// Method --> NOT take parameter and NOT return anything
	void sum() {
		System.out.println(x+y);
	}
	
	// Method --> NOT take parameter and return something
	int subt() {
		return x-y;
	}
	
	// Method --> take parameter and NOT return anything
	void div(int a, int b){
		System.out.println(a/b);
	}
	
	// Method --> take parameter and return something
	int mult(int a, int b) {
		return a*b;
	}
	
	public static void main(String args[]) {
		Calculation cal = new Calculation();
		
		cal.sum();
		
		int r = cal.subt();
		System.out.println(r);
		
		cal.div(24, 3);
		
		r = cal.mult(3, 9);
		System.out.println(r);
	}
}


