// Your name here (NO NAME, NO CREDIT!): Mohammad Taufique Imrose

package Main;

public class StackInt{
	// Fields
	private int[] a;			// Array to hold the stack items behind the scenes
	private int top;			// This is the "top" of the stack
	private final int n = 256;	// This is going to be the fixed size of the stack
	
	// Constructor
	public StackInt(){
		// TODO: Initialize the private fields (except the final constant "n")
		  a = new int[n];
          top = -1;
	}
	
	// Methods
	public void push(int item){
		// TODO: Add the item to the stack based on how stacks are supposed to work
		 if(size() != 256) {
             top++;
             a[top] = item;
     }
     else {
             System.out.println("Stack is full!!");
     }
	}
	
	public int pop(){
		// TODO: Remove and return the item at the top of the stack. If stack is empty, return -1
		 if(!isEmpty()) {
	           int value = a[top];
	           top--;
	           return value;
	       }
	           return -1; // This can be removed but is here to prevent the Java error while testing!
	}
	
	public int peek(){
		// TODO: Return the item at the top of the stack. If stack is empty, return -1
		 if(isEmpty())
	             // This can be removed but is here to prevent the Java error while testing!
		return -1;
		return a[top];
	} 
	
	public boolean isEmpty(){
		// TODO: Return whether the stack is empty (true if empty) or not (false if stack is not empty)
		return top == -1;
		// This can be removed but is here to prevent the Java error while testing!
	}
	
	public int size(){
		// TODO: Return how many items are currently in the stack; Return 0 if stack is empty
		 return top + 1;
			// This can be removed but is here to prevent the Java error while testing!
	}
	
	public void clear(){
		// TODO: Find a way to clear access to the stack so it appears empty to the user (Consider "Lazy Evaluation" for efficiency)
		top = -1;
	}
	
	public String toString(){
		// TODO: Return the String with the format of [1,2,3,4] as an example. Have stack items seperated by commas, enclosed inside brackets, and no comma at the end!
		 String result = "(";
	        for (int i = 0; i <= top; i++) {
	            result += a[i];
	            if(i != top)result += ",";
	        }
	        return result+")";
	    }
	       
	   }
	    
			// This can be removed but is here to prevent the Java error while testing!
	
