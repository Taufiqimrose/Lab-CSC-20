// Your name here (NO NAME, NO CREDIT!): Mohammad Taufique Imrose

package Main;

public class Lab07{
	public static void main(String[] args){
		// Do NOT modify this method! This portion is provided just so you can see how I will grade the assignment. 
		int[] a = {9,1,8,2,7,3,6,4,5};
		System.out.println(linearSearch(a, 0));		// This should return false
		System.out.println(linearSearch(a, 3));		// This should return true
		selectionSort(a);							// This should sort the array
		System.out.println(binarySearch(a, 0));		// This should return -1
		System.out.println(binarySearch(a, 3));		// This should return 2 (the index of value 3 once array is sorted)
		// END OF TEST DATA
	}
	
	////////////// DO ALL OF YOUR CODING BELOW THIS LINE! //////////////////////////////////
	
	public static boolean linearSearch(int[] a, int value){
		for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return true;
            }
        }

		return false;	
	}
	
	public static void selectionSort(int[] a){
		    int b;
	        for (int i = 0; i < a.length; i++) {
	            for (int o = i + 1; o < a.length; o++) {
	                if (a[i] > a[o]) {
	                    b = a[i];
	                    a[i] = a[o];
	                    a[o] = b;
	                }
	            }
	        }
	}
	
	public static int binarySearch(int[] a, int value){
		    int c1 = 0;
	        int d2;
	        int e3 = a.length - 1;
	        while (c1 <= e3) {
	            d2 = (c1 + e3) / 2;
	            if (a[d2] == value)
	            	return d2;
	            else if (value>a[d2]  ) {
	                c1 = d2 + 1;
	            } else {
	                e3 = d2 - 1;
	            }
	        }
		return -1;		
	}
}
	