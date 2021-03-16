package day4;

public class day4 {

	public static void main(String[] args) {
		
		// ##################### ARRAY ########################################################
		
		//**************************************1-D*****************************************
		int arr[] = new int[5];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		
		int ar[] = {100, 200, 300, 400, 500};
		
		System.out.println(ar.length);                 // to find length of an array
		
		System.out.println(ar[2]);
		
		// Read an Array by simple "for loop"
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		// Read an Array by Advance or Enhance "for loop"
		for(int i:ar) {
			System.out.println("-->"+i);
		}
		
		
		
		// ************************************************2-D*************************************************
		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] = 600;
		
		int a2[][] = {{100, 200}, {300, 400}, {500, 600}, {700, 800}};
		
		System.out.println("No. of rows: "+a.length);
		System.out.println("No. of cols: "+a[0].length);
		
		// read 2D array with simple "for loop"
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j <a[i].length; j++) {
				System.out.println("==> "+a[i][j]);
			}
		}
		
		// read 2D array with Enhance "for loop"
		for(int r[]:a2) {
			for(int i:r) {
				System.out.println(i);
			}
		}
		
		
		// ############################################ STRING ###########################################################
		
		String s = "  welcome    ";
		String s1 = "to Java";
		
		// length() method
		System.out.println("length: " + s.length());
		
		// concat() method
		System.out.println("concatenate: " + s.concat(s1));
		
		// trim() method
		System.out.println("remove right and left spaces: " + s.trim());
		
		// charAt() method
		System.out.println("char at given index: " + s.charAt(5));
		
		// conatins() method --> Case Sensitive
		System.out.println("match given string: " + s.contains("wel"));
		System.out.println("match given string: " + s.contains("Wel"));
		System.out.println("match given string: " + s.contains("com"));
		
		s = "welcome";
		// equals() method --> Case Sensitive
		System.out.println("tells Equality of string: " + s.equals("Welcome")+"    " + s.equals("welcome"));
		
		// equalsIgnoreCase() method --> Not Case Sensitive
		System.out.println("tells Equality of string: " + s.equalsIgnoreCase("Welcome") + "    " + s.equalsIgnoreCase("welcome"));
		
		// replace() method
		System.out.println(s.replace('e', 'E'));
		System.out.println(s.replace("wel", "hello Wel"));
		
		s1 = "welcome to java";
		System.out.println(s1.replace("java", "Selenium"));
		System.out.println(s1.replace(' ', '-'));
		
		
		// substring() method
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(1));      // (start_index) only and goes upto end of string
		System.out.println(s.substring(0,7));
		
		// toLowerCase() method
		System.out.println(s.toLowerCase());
		
		// toUpperCase() method
		System.out.println(s.toUpperCase());
	}

}
