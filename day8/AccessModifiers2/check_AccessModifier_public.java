package day8.AccessModifiers2;

//import package_name.sub_package_name.class_name
import day8.AccessModifiers.AccessModifier_public;

public class check_AccessModifier_public {
	public static void main(String args[]) {
		
		AccessModifier_public ap = new AccessModifier_public();
		
		ap.method_pub();
		
		ap.aa = 455;
		
		ap.method_pub();
	}

}
