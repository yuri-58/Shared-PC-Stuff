package Week4Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assign2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Long> enteredNumbers = new ArrayList<Long>();
	
	Scanner in = new Scanner (System.in);
	
	long userNumber = in.nextLong();
	
		for (long i = 0; i < userNumber + 1; i++) {
			enteredNumbers.add(i);
		}
	System.out.println(checkPrime(enteredNumbers));
		
	}

	public static List<Long> checkPrime(List<Long> a){
		
		List<Long> alpha = new ArrayList<Long>();
		
		for (long i = 1; i < a.size(); i++) {
			
				if (a.get(a.size() - 1) % i == 0) {
					alpha.add(i);
				}
		}
		
		return alpha;
	}
	
	/*static void factors(int userNumber) { Teacher code down below
        // Write your code below this line
    
        // Declare the List of Integer
		List<Integer> factorNum = new ArrayList<>();
		
		// Start your loop at 1, and go to the final number
		for (int i = 1; i <= userNumber; i++) {
		    // if userName is divisble equally by the index, add the index to the new List.
		    if ( userNumber % i == 0) {
		        factorNum.add(i);
		    }
		}
		
		//Print the list of factors here
		System.out.println(factorNum);
		
		// Write your code above this line
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNumber = in.nextInt();
		factors(userNumber);
	*/}

