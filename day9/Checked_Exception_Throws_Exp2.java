package day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked_Exception_Throws_Exp2 {
	public static void main(String args[]) throws IOException, InterruptedException {
		
		
		FileReader fr = null;
		fr = new FileReader("C:\\Users\\Sahu_Singh\\Documents\\Java Eclipse\\javaFirstProgram\\src\\Test.txt");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		bfr.close();
		
		Thread.sleep(5000);
		
		System.out.println("Program is exit");
	}

}
