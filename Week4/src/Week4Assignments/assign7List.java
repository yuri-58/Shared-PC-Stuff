package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign7List {

	static void halfList(List<String> words) {
		// Add your code below this line 
		List<String> newList = new ArrayList<String>();
		
		for (int i = 0; i < words.size(); i += 2) {
			
			String word = words.get(i);
			newList.add(word);
			
		}
		
		System.out.println("The old List is: " + words);
		System.out.println("The new List is: " + newList);
		
		// Add your code above this line 
	}

    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word1, word2, word3, word4, word5;
		word1 = in.nextLine();
		word2 = in.nextLine();
		word3 = in.nextLine();
		word4 = in.nextLine();
		word5 = in.nextLine();
		List<String> words = new ArrayList<>();
		words.add(word1);
		words.add(word2);
		words.add(word3);
		words.add(word4);
		words.add(word5);
		
		halfList(words);
		
	}

}
