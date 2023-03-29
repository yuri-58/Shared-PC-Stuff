package workSpace;

import java.util.Scanner;

public class testExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		
		long [] fibonacciSequence = new long [a];
		int i = 2;
		
		fibonacciSequence[0] = 1;
		fibonacciSequence[1] = 1;
		
		do {
			fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
			i++;
		} while (i < a);
		
		for (int j = 0; j < fibonacciSequence.length; j++) {
			
			System.out.print(fibonacciSequence[j] + ", ");		
		}
	}
}
