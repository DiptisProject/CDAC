
package Assignment2;

import java.util.Scanner;

public class RemoveWhiteSpace {
	    public static String removeWhiteSpaces(String str) {
	     
	        return str.replaceAll("\\s+", "");
	    }
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a string: ");
	     String input = sc.nextLine();
	       
	     String output = removeWhiteSpaces(input);   
	     System.out.println("Output: " + output);
	        
	     sc.close();
	}
	

}
