package day9;

public class checked_Exception {
	public static void main(String args[]) {
		
		System.out.println("Program is Start");
		System.out.println("Program is in Progress");
		
		// Thread.sleep(5000);   ==> Gives Exception
		
		// one way suggestion given by compiler by try-catch block
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("Program is complete");
		System.out.println("Program is exit");
	}
}
