package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign6List {

	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
	    // Add your code below this line
	    List<Integer> squaredNums = new ArrayList<Integer>();
	    
	    squaredNums.add(num1 *= num1);
	    squaredNums.add(num2 *= num2);
	    squaredNums.add(num3 *= num3);
	    squaredNums.add(num4 *= num4);
	    squaredNums.add(num5 *= num5);
	    
	  
	    // Add your code above this line
	    
	    return squaredNums;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		
		System.out.println(squaredList(num1,num2,num3,num4,num5));
	}

}
