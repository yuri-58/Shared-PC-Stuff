package workSpace;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int userNumber;
		userNumber = in.nextInt();
		
		if ( userNumber > 10 && userNumber < 100) {
			
			while ( userNumber >= 10) {
				System.out.println(userNumber);
				userNumber--;
			}
		} else {
			System.out.println("Your number is not between 10 and 100.");
		}
		
	//Don't add beyond here
	}
}
