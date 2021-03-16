package day7;

public class Final_variable {
	
	final int a = 100;
	
	public static void main(String args[]) {
		
		Final_variable fm = new Final_variable();
		
		// fm.a = 40;     --> Compile time Error
		
		System.out.println(fm.a);
	}

}
