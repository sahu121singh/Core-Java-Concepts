package day9;

public class Uncheck_Exception_Handling {
	public static void main(String args[]) {
		
		System.out.println("Program is Start");
		System.out.println("Program is in Progress");
		
		
		// try block with single catch block
		
		int a = 100;
		try {
			System.out.println(a/0);           // ==> Throw ArithmeticException
		}
		catch(ArithmeticException e) {
			System.out.println("Enter in Catch block ==> a no. can't divide by 0");
		}
		
		// try block with multiple catch block
		
		String s = null;
		try {
			System.out.println(s.length());   //==> Throw NullPointerException
		}
		catch(ArithmeticException e) {
			System.out.println("Enter in Catch block ==> a no. can't divide by 0");
		}
		catch(NullPointerException e) {
			System.out.println("Enter in Catch block ==> null string have no length");
		}
		
		// try-catch blocks even exception is not known
		String x = "abc";
		try {
			int i = Integer.parseInt(x);     // ==> Throw NumberFormatException
		}
		catch(Exception e) {
			System.out.println("Enter in Catch block ==> if exception is not Known");
		}
		
		
		int arr[] = new int[5];
		try {
			arr[10] = 50;               //==> Throw ArrayIndexOutOfBoundsException
		}
		catch(Exception e) {
			System.out.println("Enter in Catch block ");
		}
		
		
		System.out.println("Program is complete");
		System.out.println("Program is exit");
	}

}
