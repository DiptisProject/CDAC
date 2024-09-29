package Assignment2;

import java.util.Scanner;

public class ReverseWord {
	private static String reverseword(String sentence) {
		// TODO Auto-generated method stub
		String[] words = sentence.split(" ");
		StringBuilder reversesentence = new StringBuilder();
		
		for(int i = words.length-1; i>= 0; i--) {
			reversesentence.append(words[i]);
			if(i!=0) {
				reversesentence.append(" ");
			}
		}
		return reversesentence.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Sentence:");
    String sentence=sc.nextLine();
    
    String result = reverseword(sentence);
    System.out.println("Reverse Sentence:" +result);
    sc.close();
	}
}
