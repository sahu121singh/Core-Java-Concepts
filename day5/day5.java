package day5;
class Emp{
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
}

public class day5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp E1 = new Emp();
		E1.eid = 101;
		E1.ename = "Sahu";
		E1.sal = 39823.00;
		E1.deptno = 10;
		E1.job = "Manager";
		E1.display();
		
		Emp E2 = new Emp();
		E2.eid = 121;
		E2.ename = "Sahu_singh";
		E2.sal = 398283.00;
		E2.deptno = 18;
		E2.job = "HR";
		E2.display();
		

	}

}
