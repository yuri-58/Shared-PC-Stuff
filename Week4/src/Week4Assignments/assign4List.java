package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign4List {

	static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
		// Write your code below this line
		
		List<String> threeWords =  new ArrayList<String>();
		
		if (num1 < 10 && num1 >= 0 && num2 < 10 && num2 >= 0 && num3 < 10 && num3 >= 0) {
			threeWords.add(tenWords.get(num1));
			threeWords.add(tenWords.get(num2));
			threeWords.add(tenWords.get(num3));
			System.out.println(threeWords);
		} else {
			System.out.println("Sorry, there was an error getting a number you requested.");
		}
		
		// Write your code above this line
	}

    // DO NOT CHANGE ANY CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		List<String> tenWords = new ArrayList<>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, num1, num2, num3);
		
	}

}
