package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign8List {

	static void sumList(int num1, int num2, int num3, int num4) {
		// Write your code below this line
		List<Integer> sum = new ArrayList<Integer>();
		sum.add(num1);
		sum.add(num2);
		sum.add(num3);
		sum.add(num4);
		sum.add(num1 + num2 + num3 + num4);	
		
		System.out.println(sum);
		// Write your code above this line
	}
    
    
    // DO NOT CHANGE THE CODE BELOW THIS LINE
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, num4;
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		num4 = in.nextInt();
		sumList(num1, num2, num3, num4);
		
	}

}
