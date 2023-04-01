package Week4Assignments;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class assign1List {

	
		// TODO Auto-generated method stub
		static void findLetter(List<Character> alphabet, char userLetter) {
			// Write your code below this line 
			
			for (char a : alphabet) {
				
				if (alphabet.contains(userLetter)) {
					System.out.println(alphabet.indexOf(userLetter));
					break;
				}
			}
			    
			}
		
			// Write your code above this line 
		

	    // DO NOT CHANGE THE CODE BELOW THIS LINE
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			char userLetter = in.next().charAt(0);
			
			List<Character> alphabet = new ArrayList<>();
			for (int i = 97; i < (97+26); i++) {
			    alphabet.add((char) i);
			}
			
			findLetter(alphabet, userLetter);
		}
	

}
