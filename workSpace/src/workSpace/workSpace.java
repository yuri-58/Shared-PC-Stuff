package workSpace;

import java.util.Scanner;

public class workSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
		 String userWord = in.nextLine();
		 int wordLength = userWord.length();
		 int counter = wordLength;
	//	 int counter = 1;
	//	 if ( wordLength > 4) {
	//		 do {
	//			 System.out.println(userWord);
	//			 counter++;
				 
	//		 } while ( counter <= wordLength);
	//	} else {
	//			System.out.println(userWord);
	//	}
		 
		 
			do {
			    System.out.println(userWord);
			    if ( wordLength < 5 ) {
			        break;
			    } 
			    counter--;
			} while ( counter > 0 );
	//Don't delete beyond this point        
	}
	
}

