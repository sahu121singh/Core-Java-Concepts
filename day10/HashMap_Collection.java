package day10;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Collection {

	public static void main(String[] args) {
		
		// $$$$$$$$$$$$$$$$$$$  declare HashMap ==> 1. fixed d_tpye Key-Value pairs $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		
		// ************* add elements to HashMap *******************************      ==> .put(key, value)
		hp.put(101, "Smith");
		hp.put(102, "John");
		hp.put(106, "Morgan");
		hp.put(104, "Smith");
		hp.put(105, "Charlies");
		
		// ************ print HashMap ************************ 
		System.out.println("way-1: " + hp);
		System.out.println("way-2: "+hp.entrySet());
		
		// ************* size of HashMap *********************     ==> .size()
		System.out.println(hp.size());
		
		hp.put(108, "Gorge");
		System.out.println(hp);
		
		System.out.println(hp.keySet());  // ==> array of Keys of HashMap ==> .keySet()
		System.out.println(hp.values());  // ==> array of Values of HashMap ==> .values()
		
		System.out.println(hp.get(101));  // ==> value of a particular key
		
		
		
		// ***********  read elements *******************
		for(Map.Entry s:hp.entrySet()) {
			System.out.println(s.getKey()+"    "+s.getValue());
		}	
		
		
		
		// $$$$$$$$$$$$$$$$$$$  declare HashMap ==> 2. different d_tpye Key-Value pairs $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
		
		HashMap map = new HashMap();
		
		// ************* add elements to HashMap *******************************      ==> .put(key, value)
		map.put(101, "Smith");
		map.put(true, "John");
		map.put(106, 9345);
		map.put(104, "Smith");
		map.put(105, "Charlies");
		map.put("idx", false);
		map.put(34, 9);
		
		// ************ print HashMap ************************ 
		System.out.println("way-1: " + map);
		System.out.println("way-2: "+map.entrySet());
		
		// ************* size of HashMap *********************     ==> .size()
		System.out.println(map.size());
		
		map.put(108, "Gorge");
		System.out.println(map);
		
		System.out.println(map.keySet());  // ==> array of Keys of HashMap ==> .keySet()
		System.out.println(map.values());  // ==> array of Values of HashMap ==> .values()
		
		System.out.println(map.get(101));  // ==> value of a particular key
		
		
		
		// ***********  read elements *******************
		for(Object s:map.entrySet()) {
			System.out.println(s);
		}
		
		/*
		for(Map.Entry s:map.entrySet()) {
			System.out.println(s.getKey()+"    "+s.getValue());
		}	*/
	}

}
