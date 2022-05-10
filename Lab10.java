// Your name here (NO NAME, NO CREDIT!): Mohammad Taufique Imrose

package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Lab10{
	public static void main(String[] args){
		// TEST PORTION (DO NOT MODIFY!)
		ArrayList<String> alist = new ArrayList<String>();	// Created array list
		Stack<Integer> st = new Stack<Integer>();			// Created stack
		final int n = 10;
		for(int i = 0; i < n; i++){
			alist.add(Integer.toString(i));
			st.push(i);
		}
		  Iterator<String> arrayIterator=getArrayListIterator(alist);
	       System.out.println("ArrayList elements are: ");
	while (arrayIterator.hasNext()) {
	   p(arrayIterator.next());   
	}
	      
	System.out.println();
	       Iterator<Integer> stackIterator=getStackIterator(st);
	       System.out.println("Stack Elements are:");
	while (stackIterator.hasNext()) {    
	   pn(st.pop());
	}
	
	
	}	
    public static Iterator<Integer> getStackIterator(Stack<Integer> st){
		
		Iterator<Integer> v1 = st.iterator();

		return v1;
	}
	public static Iterator<String> getArrayListIterator(ArrayList<String> aList) {

		

		Iterator<String> v2 = aList.iterator();

		return v2;

		}
	
	
	public static <E> void p(E item){
		System.out.print(item + " ");
	}
	
	
	public static <E> void pn(E item){
		System.out.println(item);
	}
}