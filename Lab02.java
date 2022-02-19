// Your name here: Mohammad Taufique Imrose

package Main;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Lab02{
	public static void main(String[] args){
		// My code to dynamically create a small movie database (DO NOT MODIFY OR REMOVE!)
		String[] movies = new String[5];
		movies[0] = "Shawshank Redemption*1994*Tim Robbins*2.36";
		movies[1] = "The Godfather*1972*Al Pacino*2.92";
		movies[2] = "Raging Bull*1980*Robert De Niro*2.15";
		movies[3] = "Million Dollar Baby*2004*Hilary Swank*2.2";
		movies[4] = "Straight Outta Compton*2015*Jason Mitchell*2.45";
		// End of code
		
		 int n = movies.length;
	     String[] titles = new String[n];
	     int[] years = new int[n];
	     String[] stars = new String[n];
	     float[] runtimes = new float[n];
	    
	      for(int i=0; i<n; i++){
	          try{
	           String raw = movies[i];
	           StringTokenizer st = new StringTokenizer(raw, "*");
	           titles[i] = st.nextToken();
	           years[i] = Integer.parseInt(st.nextToken());
	           stars[i] = st.nextToken();
	           runtimes[i] = Float.parseFloat(st.nextToken());
	          }catch(NoSuchElementException e){
	              System.out.println("NoSuchElementException raised.");
	          }
	      }

	      System.out.println("-----MOVIES-----");
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }
        System.out.println("-----YEARS-----");
        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);
        }
        System.out.println("-----STARS-----");
        for (int i = 0; i < stars.length; i++) {
            System.out.println(stars[i]);
        }
        System.out.println("-----RUNTIMES-----");
        for (int i = 0; i < runtimes.length; i++) {
            System.out.println(runtimes[i]);
        }
	      }
		
		
	}
	
	 

	