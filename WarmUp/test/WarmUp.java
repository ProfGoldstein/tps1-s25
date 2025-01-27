/*
 * Problem Set 1
 * WarmUp.java
 * 
 * Reads in a positive integer and a line of text, then prints the text the 
 * given number of times.
 *
 * @author Luke Ostrander
 */

import java.util.*;


public class WarmUp {
   
    /**
     * The integer and text are read in, and the text is printed.
     */
    public static void main(String[] args) { 
	  Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      scanner.nextLine();
      String text = scanner.nextLine();
      for (int i = 0; i < num; i++) {
          System.out.println(text);
      }  
      scanner.close();
    }
    
}