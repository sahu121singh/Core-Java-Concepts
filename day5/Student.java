package day5;

public class Student {

	int sid;
	String name;
	char grade;
	
	void getvalues(int id, String sname, char sgrade) {
		sid = id;
		name = sname;
		grade = sgrade;
	}
	
	void display() {
		System.out.println(sid+"  "+name+"  "+grade);
	}
}

class Const_Student{
	int sid;
	String name;
	char grade;
	Const_Student(int id, String sname, char sgrade){
		sid = id;
		name = sname;
		grade = sgrade;
	}
	void display() {
		System.out.println(sid+"  "+name+"  "+grade);
	}
}