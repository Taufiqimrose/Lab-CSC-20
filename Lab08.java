// Your name here: Mohammad Taufique Imrose

package Main;

import java.util.ArrayList;

public class StackList{
	// Fields
	private ArrayList<String> a;		// Declared object
	
	// Constructor
	public StackList(){
	    a = new ArrayList<>();
	}
	
	// Methods
	public void push(String item){
		 a.add(item);
	}
	
	public String pop(){
		 if (isEmpty()) {
              return "EMPTY";
      }
         String s = a.remove(a.size() - 1);
         a.remove(a.size() - 1);
         return s;
	}
	
	public String peek(){
		 if (isEmpty()) {
         return "EMPTY";
     }
         return a.get(a.size() - 1);
	}
	
	public boolean isEmpty(){
		 if(a.size()==0)
		 return true;
		 else
		 return false;
	}
	
	public int size(){
		 return a.size();
	}
	
	public void clear(){
		 a.clear();
	}
}