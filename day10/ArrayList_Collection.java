package day10;

import java.util.ArrayList;

public class ArrayList_Collection {
	public static void main(String args[]) {
		
		// $$$$$$$$$$$$$$$$$$$  declare ArrayList ==> 1. same d_tpye elements $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		// for integers
		// ArrayList<Integer> array = new ArrayList<Integer>();
		
		// for string
		ArrayList<String> str = new ArrayList<String>();
		
		
		// ************* add elements to ArrayList *******************************      ==> .add(element)
		
		str.add("John");
		str.add("Smith");
		str.add("Charlies");
		str.add("Scott");
		
		 
		// ************* size of ArrayList *********************     ==> .size()
		
		System.out.println(str.size());
		
		// ************ print ArrayList ************************       
		System.out.println(str);
		
		// ************* remove element ****************            ==> .remove(index)
		System.out.println(str.remove(2));
		
		System.out.println("After removing an element: " + str);
		
		// ************** add element at an index ****************** ==>  .add(index, element)
		str.add(2, "Morgan");
		
		System.out.println(str);
		
		// ***********  read elements *******************
		for(String s:str) {
			System.out.println(s);
		}
		
		
		
		
		
		// $$$$$$$$$$$$$$$$$$$  declare ArrayList ==> 2. different d_type elements $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		
		// for different d_type elements
		ArrayList lst = new ArrayList();
		
		lst.add("John");
		lst.add("Smith");
		lst.add("Charlies");
		lst.add("Scott");
		lst.add(8);
		lst.add(true);
		lst.add('S');
		
		 
		// ************* size of ArrayList *********************     ==> .size()
		
		System.out.println(lst.size());
		
		// ************ print ArrayList ************************       
		System.out.println(lst);
		
		// ************* remove element ****************            ==> .remove(index)
		System.out.println(lst.remove(2));
		
		System.out.println("After removing an element: " + lst);
		
		// ************** add element at an index ****************** ==>  .add(index, element)
		lst.add(2, "Morgan");
		
		System.out.println(lst);
		
		// ***********  read elements *******************
		for(Object s:lst) {                        // Object type of variable can hold any d_type of values
			System.out.println(s); 
		}
		
		
		//########################################
		
		Object arr[] = new Object[5];
		
		arr[0] = 8;
		arr[1] = true;
		arr[3] = 'J';
		arr[4] = "John";
		
		for(Object s:arr) {                        // Object type of variable can hold any d_type of values
			System.out.println(s); 
		}
		
	}

}
