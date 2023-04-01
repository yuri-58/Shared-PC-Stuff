package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign3List {

	static void createList(int endNum) {
		// Write your code in this method
		List<Integer> alpha = new ArrayList<Integer>();
		
		for (int i = 1; i <= endNum; i++) {
			alpha.add(i);
		}
		System.out.println(alpha);
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
		
		createList(endNum);
	}

}
