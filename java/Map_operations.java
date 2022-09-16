package demo;

import java.util.HashMap;
import java.util.Map;

public class Map_operations {

	public static void main(String[] args) {
		//empMap1
		Map<String, String> parent = new HashMap<>();
		
		parent.put("1", "Vikas");
		parent.put("2", "Rupal");
		parent.put("3", "Advika");
		parent.put("4", "Pratyay");

		//empMap2
		Map<String, String> child = new HashMap<>();
		
		child.put("3", "David"); //It will replace Pratyay with David
		child.put("4", "John");  //A new pair of employee to be added

		//Merge maps
		Map<String, String> mergedmap = new HashMap<>();
        mergedmap = conflate(parent, child);

		System.out.println(mergedmap);
	}
	
	public static Map<String, String> conflate(Map<String, String> parent, Map<String, String> child)
	{	
		parent.putAll(child);
		return parent;
	}
}
