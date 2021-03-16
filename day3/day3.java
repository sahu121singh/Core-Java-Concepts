package day3;

public class day3 {
	public static void main(String args[]) {
		
		//*******************************CONDITIONAL STATEMENT****************************************
		// if.....else
		int age = 20;
		if(age >= 18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible for vote");
		}
		
		
		// nested if.....else
		int a = 10;
		int b = 5;
		if(a < b) {
			System.out.println("a less than b");
		}
		else if(a == b) {
			System.out.println("a eqauls to b");
		}
		else {
			System.out.println("a greater than b");
		}
		
		// switch case
		int day = 3;
		switch(day) {
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("day not exists in week");
		}
		
		// *******************************************LOOP Statements**********************************
		
		// while loop
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		
		// do while loop
		int j = 20;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
		
		// for loop
		for(int k = 1; k<=10; k=k+2) {
			System.out.println(k);
		}
		
		
		//**************************************************Jump Statements***********************************
		
		// break
		for(int m = 0; m <= 10; m++) {
			if(m==5) {
				break;
			}
			else {
				System.out.println(m);
			}
		}
		
		
		// continue
		for(int m = 100; m >= 10; m=m-10) {
			if(m==50) {
				continue;
			}
			else {
				System.out.println(m);
			}
		}
		
	}

}
