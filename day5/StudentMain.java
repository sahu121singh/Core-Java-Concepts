package day5;

public class StudentMain {
	public static void main(String args[]) {
		Student s = new Student();
		
		// class variables assign using reference variables
		s.sid = 101;
		s.name = "Sahu";
		s.grade = 'B';
		s.display();
		
		// class variables assign using method
		s.getvalues(102, "Sahu_SIngh", 'A');
		s.display();
		
		// class variables assign using constructor
		Const_Student s1 = new Const_Student(103, "SINGH", 'C');
		s1.display();
	}

}