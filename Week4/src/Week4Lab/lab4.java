package Week4Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
	StringBuilder alpha = new StringBuilder ();
	alpha.append("Hello there");
	
	System.out.println(alpha);
	
	alpha.append(" Hiya how are ya?");
	
	System.out.println(alpha);
			
		
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
	List<String> catNames = new ArrayList<String>();
	catNames.add("Thunder");
	catNames.add("Roen brother of Thunder");
	catNames.add("Love");
	catNames.add("Thomas");
	catNames.add("Oliver");
	
	String omega = "Butch";
	
	System.out.println(catNames);
	
	for (int i = 0; i < catNames.size(); i++) {
		
		System.out.println(catNames.get(i));
		
	}
	System.out.println("");
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
	//System.out.println(shortest(catNames));
				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
	//System.out.println(switched(catNames));
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
	//System.out.println(catNamesString(catNames));
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
	//System.out.println(combinedList(catNames, omega));
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
	
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string


				
				// 9. Create a set of strings and add 5 values

				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.


				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
			
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set


				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word

			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)

				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				

			}
			
			
			// Method 15:
			
			
			
			// Method 14:
			

			
			// Method 12:
			

			
			// Method 11:
			


			// Method 10:
			

			
			// Method 8:
			

			
			// Method 7:
			

			
			// Method 6:
	public static List<String> combinedList(List<String> a, String b) {
		
		a.add(b);
		return a;
		
	}

			
			// Method 5:
	public static String catNamesString(List<String> a) {
		
		List<String> newA = a;
		String beta = "";
		String alpha = newA.get(0);
		
		for (int i = 1; i < newA.size(); i++) {
			alpha += newA.get(i);
		}
		
		return alpha;
	}
			
			
			// Method 4:
	public static List<String> switched(List <String> a) {
		
		List <String> newA = a;
		
		Collections.swap(newA, 0, newA.size() - 1);
		
		return newA;
	}
			
			
			// Method 3:
	public static String shortest(List <String> a) {
		
		String word1 = a.get(0);
		
		for (int i = 1; i < a.size(); i++) {
			
			String word2 = a.get(i);
			
			if (word1.length() > word2.length()) {
				word1 = word2;
			}
			
		}
		
		return word1;
	}

}
