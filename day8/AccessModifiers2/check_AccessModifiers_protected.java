package day8.AccessModifiers2;

//  import package_name.sub_package_name.class_name
import day8.AccessModifiers.AccessModifiers_protected;


public class check_AccessModifiers_protected extends AccessModifiers_protected{
	public static void main(String args[]) {
		
		check_AccessModifiers_protected check = new check_AccessModifiers_protected();
		
		check.xxx = 888;
		check.method1();
	}

}
