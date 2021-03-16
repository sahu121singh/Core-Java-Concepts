package day5;

public class EmployeeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		E1.eid = 10123;
		E1.ename = "Sahu";
		E1.sal = 39823.00;
		E1.deptno = 10;
		E1.job = "Manager";
		E1.display();
		
		Employee E2 = new Employee();
		E2.eid = 12122;
		E2.ename = "Sahu_singh";
		E2.sal = 398283.00;
		E2.deptno = 18;
		E2.job = "HR";
		E2.display();
		
		Emp E3 = new Emp();         // class is defined in day5.java
		E3.eid = 121;
		E3.ename = "Sahu_singh";
		E3.sal = 398283.00;
		E3.deptno = 18;
		E3.job = "HR";
		E3.display();
		
		

	}

}
