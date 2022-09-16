package demo;

public class String_compare {

	public static void main(String[] args) {
		// String literal initialization
		/* 
		 * String literal working principle - 
		 * If we create an string object using String literal, it may return an existing object from String pool, if it already exists. 
           Otherwise, it will create a new string object and put it in a string pool for future re-use.
		 */
        long lit_start = System.currentTimeMillis();
          
        for (int i = 0; i < 10000; i++)
        {
            String str1 = "BrightSunnyDay";
            String str2 = "Wonderful";
        }
          
        long lit_end = System.currentTimeMillis();
        
        long lit_total_time = (lit_end - lit_start);
  
        System.out.println("Total time taken for execution of "+ "String literal is: " + lit_total_time);
  
		// String object initialization
		/* 
		 * String object working principle - 
		 * When we create a String object using the new() operator, it always creates a new object in heap memory.
		 */
        long obj_start = System.currentTimeMillis();
          
        for (int i = 0; i < 10000; i++)
        {
            String str3 = new String("BrightSunnyDay");
            String str4 = new String("Wonderful");
        }
          
        long obj_end = System.currentTimeMillis();
        long obj_total_time = obj_end - obj_start;
 
        // Important - Total time of execution will more in case String Object than String literal.
        System.out.println("Total time taken for execution of "+ "String object is: " + obj_total_time);
	}
}
