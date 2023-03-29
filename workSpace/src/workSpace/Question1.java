package workSpace;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		 String userWord = in.next();
	     String longString ="";
	 
	        // create your for loop here
	        for ( int counter = 0; counter < userWord.length(); counter++ ) {
	            longString += userWord; //I didn't know about the plusEquals
	        }
	        
	        // Do not change this code
	        System.out.println(longString);
}
}