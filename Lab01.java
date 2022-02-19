// Your name here: Mohammad Taufique Imrose

package Main;

public class Lab01{
	public static void main(String[] args){
		// TESTER: DO NOT MODIFY!!!
		int[] a = {2,5,3,4,9,8,6,7,1,0};
		int[] b = {5,4,6,3,7,2,8,-1,1,9};
		Lab01 lab = new Lab01(a);			// Declare and initialize class object
		p(lab.getSize());					// Should return 10
		p(lab.getElement(0));				// Should return 2
		p(lab.getMax());					// Should return 9
		p(lab.getSum());					// Should return 45
		p(Lab01.getStaticMin(b));			// Should return -1
		// END OF TEST!!!
	}
	// HELPER METHOD FOR TEST: DO NOT MODIFY!!!
	public static <E> void p(E item){
		System.out.println(item);
	}
	
	// Fields below here...
	
	private int array[];
	
	// Constructor below here...
	
	public Lab01(int[] array) {
	
	this.array = new int[array.length];	
	
	for (int i = 0; i < array.length; i++) {
    
	this.array[i] = array[i];}
		
   }
	
	// Methods below here...
	
	private int getSize() {
		
	    return array.length;
   }
	
	private int getElement(int c) {
	
	if (c < 0 || c > array.length) {
    
	    return -1;
     
   }
	
	    return array[c];
	
   }
	
	public int getMax() {
        
    if (array.length == 0) {
        
    	return -1;
   }
        
    int maxV = array[0];
       
    for (int i = 1; i < array.length; i++) {
            
    if (array[i] > maxV) {
    
    maxV = array[i];
    
    }
    
    }
        
       return maxV;
    
	}

	private int getSum() {
         
    if (array == null) {
                
       return 0;
         
    }
        
    int totalSum = 0;
        
    for (int i = 0; i < array.length; i++) {
                 
    totalSum += array[i];
         
    }
        
       return totalSum;
    }
	private static int getStaticMin(int[] input) {
         
     if (input == null) {
                
       return -1;
         
    }
       
     int minValue = input[0];
         
     for (int i = 0;i<input.length;i++) {
                
     if (input[i] < minValue) {
                       
         minValue = input[i];
                
    }
    }
         
       return minValue;
    }
    }