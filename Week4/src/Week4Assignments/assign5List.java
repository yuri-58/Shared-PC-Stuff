package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign5List {

	static void beginEnd(int endNum) {
		// Add your code below this line 
		List<Long> alpha = new ArrayList<Long>();
		
		if (endNum > 0) {
			
			for(long i = 1; i <= endNum; i++) {
				
				alpha.add(i);
			}
			
			System.out.println("The first number in the List is " + alpha.get(0));
			System.out.println("The last number in the List is " + alpha.get(endNum - 1));
			
		} else {
			System.out.println("Your List cannot be created with a number less than one.");
		}
		
		// Add your code above this line
	}
	
	
    //DO NOT CHANGE THE CODE BELOW THIS LINE 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
	
		beginEnd(endNum);
	}
}
