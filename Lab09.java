// Your name here: Mohammad Taufique Imrose

package Main;

public class Lab09{
	public static void main(String[] args){
		// My tests (DO NOT MODIFY!)
		int[] a = {3,2,6,4,15,7,9,8,6};
		p(recurseSum(a));				// Sum should be 60
		p(recurseMax(a));				// Max should be 15
		// End of tests!
	}
	
	// Recursive methods below here...
	public static int recurseSum(int[] a){
		  return recurseSum(a, a.length); 
	}
	  private static int recurseSum(int[] a, int length) {
	        if (length > 0)
	            return a[length - 1] + recurseSum(a, length - 1);
	        return 0;
	    }
	
	public static int recurseMax(int[] a){
		 return recurseMax(a, 0, Integer.MIN_VALUE);
	}
	   private static int recurseMax(int[] a, int index, int max) {
           
           if (index == a.length) {
                   return max;
           }
           max = max > a[index] ? max : a[index];
           return recurseMax(a, index + 1, max);
   }
	// End recursive methods
	
	/* Method to make printing text easy */
	public static <E> void p(E item){
		System.out.println(item);
	}
}