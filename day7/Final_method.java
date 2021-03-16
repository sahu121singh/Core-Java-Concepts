package day7;

class Bike{
	
	final void run() {                              // final method, cannot override in child class
		System.out.println("Running>>>>>>>>>>>");
	}
}

class Honda extends Bike{
	
	/*                        **************  Compile time error
	void run() {
		System.out.println("Running Honda...............");
	} */
}

public class Final_method {
	public static void main(String args[]) {
		
		Honda h = new Honda();
		
		h.run();
	}

}
