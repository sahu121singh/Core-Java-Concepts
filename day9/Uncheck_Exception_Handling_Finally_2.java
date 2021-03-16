package day9;

public class Uncheck_Exception_Handling_Finally_2 {
	public static void main(String args[]) {
		
		System.out.println("Program is Start");
		
		// 1. Exception occur and not handled
		int a = 100;
		try {
			System.out.println(a/0);
		}
		catch(NullPointerException e) {
			System.out.println("Enter in Catch block");
		}
		finally {
			System.out.println("***********Enter in finally block*******");
		}
		
		System.out.println("Program is complete");
	}

}
