package Week4Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Why would we use a StringBuilder instead of a String?
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
	Scanner in = new Scanner (System.in);
		
	StringBuilder alpha = new StringBuilder ();
	alpha.append("Hello there");
	
	System.out.println(alpha);
	
	alpha.append(" Hiya how are ya?");
	
	System.out.println(alpha);
	
	char beta = 'R';
			
		
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
	List<String> catNames = new ArrayList<String>();
	catNames.add("Thunder");
	catNames.add("Roen brother of Thunder");
	catNames.add("Love");
	catNames.add("Thomas");
	catNames.add("Oliver");
	
	List<Integer> randomNumber = new ArrayList<Integer>();
	randomNumber.add(7);
	randomNumber.add(3);
	randomNumber.add(45);
	randomNumber.add(52);
	randomNumber.add(78);
	randomNumber.add(24);
	randomNumber.add(81);
	randomNumber.add(16);
	randomNumber.add(12);
	randomNumber.add(9);
	randomNumber.add(89);
	randomNumber.add(14);
	randomNumber.add(5);
	randomNumber.add(90);
	randomNumber.add(8);
	
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
	//System.out.println(newList(randomNumber));
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
	//System.out.println(listStringToInt(catNames));

				
				// 9. Create a set of strings and add 5 values
	Set<String> bandNames = new HashSet<String>();
	bandNames.add("Good Morning Guilty");
	bandNames.add("Rise Against");
	bandNames.add("Tool");
	bandNames.add("21 Pilots");
	bandNames.add("Offspring");
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
	//System.out.println(setStringWithChar(bandNames, beta));

				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
	//System.out.println(setToList(bandNames));
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
	Set<Integer> moreRandoNums = new HashSet<Integer>();
	moreRandoNums.add(7);
	moreRandoNums.add(12);
	moreRandoNums.add(14);
	moreRandoNums.add(21);
	moreRandoNums.add(23);
	moreRandoNums.add(27);
	moreRandoNums.add(32);
	moreRandoNums.add(41);
	moreRandoNums.add(59);
	
	//System.out.println(setToEvenSet(moreRandoNums));
				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
	Map<String, String> wordDefinitions = new HashMap<String, String>();
	wordDefinitions.put("Fear", "an unpleasant emotion caused by the belief that someone or something is dangerous, likely to cause pain, or a threat.");
	wordDefinitions.put("Courage", "the ability to do something that frightens one.");
	wordDefinitions.put("Strive", "to make great efforts to achieve or obtain something. To have the courage, dispite all fear, to fight your achievment");
			
	String input = in.next();			
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
	//System.out.println(lookUp(wordDefinitions, input));
				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
	System.out.println(countString(catNames));			

			}
			
			
			// Method 15:
	public static Map<Character, Integer> countString(List<String> a) {
		
		Map<Character, Integer> alpha = new HashMap<Character, Integer>();
		
		for (String string : a) {
			char b = string.charAt(0);
			
			if (alpha.get(b) == null) {
				alpha.put(b, 1);
			} else {
				alpha.put(b, alpha.get(b) + 1);
			}
		}
		
		return alpha;
	}
			
			
			// Method 14:
	public static String lookUp(Map<String, String> b, String a) {
		
		for(String key : b.keySet()) {
			if (key.equals(a)) {
				return b.get(key);
			}
		}
		
		
		return null;
	}

			
			// Method 12:
	public static Set<Integer> setToEvenSet(Set<Integer> a){
		
		Set<Integer> alpha = new HashSet<Integer>();
		
		for (Integer number : a) {
			
			if (number % 2 == 0) {
				alpha.add(number);
			}
		}
		
		return alpha;
	}

			
			// Method 11:
	public static List<String> setToList(Set<String> a){
		
		List<String> alpha = new ArrayList<String>(a);
		
		return alpha;
	}


			// Method 10:
	public static Set<String> setStringWithChar(Set<String> a, char b) {
		
		Set<String> printed = new HashSet<String>(); //initialize a new set
		
		for (String string : a) { //for Strings inside of the set of Strings a
			
			if (string.charAt(0) == b) { //if the string contains a starting character b,
				printed.add(string);	// add it to the new set
			}
			
		}
		
		return printed;
	}

			
			// Method 8:
	public static List<Integer> listStringToInt(List<String> a) {
		
		List<Integer> alpha = new ArrayList<Integer>();
		String b = "";
		int c = 0;
		
		for (int i = 0; i < a.size(); i++) {
			b = a.get(i);
			c = b.length();
			alpha.add(c);
		}
		
		return alpha;
	}

			
			// Method 7:
	public static List<Integer> newList(List<Integer> a){
		
		List<Integer> alpha = new ArrayList<Integer>();
		List<Integer> beta = new ArrayList<Integer>();
		List<Integer> delta = new ArrayList<Integer>();
		List<Integer> lambda = new ArrayList<Integer>();
		List<Integer> omega = new ArrayList<Integer>();
		
		for (int i = 0; i < a.size(); i++) {
			
			if (a.get(i) % 2 == 0) {
				
				int n = a.get(i);
				alpha.add(n);
			} else if (a.get(i) % 3 == 0) {
				
				int m = a.get(i);
				beta.add(m);
			}else if (a.get(i) % 5 == 0) {
				
				int p = a.get(i);
				delta.add(p);
			} else {
				
				int q = a.get(i);
				lambda.add(q);
			}
			
		}
		alpha.add(null);
		beta.add(null);
		delta.add(null);
		
		omega.addAll(alpha);
		omega.addAll(beta);
		omega.addAll(delta);
		omega.addAll(lambda);
		
		return omega;
	}

			
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
