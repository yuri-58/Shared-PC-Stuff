package Week3n4Project;

import java.util.Scanner;

public class project {
//Start of main Runner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		//String oG = "Will you use the original array (8) or the new (9)? ";
		//String isIt = "True or False: It is hot outside! How much money ya got?";
		//System.out.print(oG);
		//String userWord = in.next();
		//int userInputNumber = in.nextInt();
		//String firstName = in.next();
		//String lastName = in.next();
		//System.out.println(isIt);
		//boolean isHotOutside = in.nextBoolean();
		//double moneyInPocket = in.nextDouble();
		int alpha = in.nextInt();
		
		
		
		
		//1 using arrayIntAge
		//System.out.println(subt(userInputNumber));
		
		//1b using 9, refer to intAge again
		
		//1c refer to arrayIntAvgSum, arrayIntAvgSum, and avG
		//System.out.println(avG(userInputNumber));
		
		//2 refer to names, disable userinputnumber
		
		//2a refer to names and avgChar
		//System.out.println(avgChar(true));
		
		//2b refer to concat names
		//System.out.println(concatNames(true));
		
		//6 refer to nameSum
		//System.out.println(nameSum(true));
		
		//7 unlock string scanner userword and int scanner userinputnumber
		//System.out.println(repeat(userWord, userInputNumber));
		
		//8 disable userinput and userWord, unlock firstname and lastname, refer to name entry
		//System.out.println(nameEntry(firstName, lastName));
		
		//9 disable all scanners
		//System.out.println(checkArray(true));
		
		//10
		//System.out.println(doubArrayAvg(true));
		
		//11 
		//System.out.println(twoDoubArrayEntry(true));
		
		//12 unlock boolean and double
		//System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//13
		number(alpha);
		
		
	}
//End of main Runner
	public static int subt (int a) {
		
		int [] arrayUsed = arrayIntAge(a);
		int subt = arrayUsed[0] - arrayUsed[arrayUsed.length - 1];
		return subt;
	}
	
	public static double arrayDoubAvgSum(double[] array) {
		
		double avg = 0;
		int i = 0;
		
		for (double sum : array) {
			array[i] += sum;
			avg += sum;
			i++;
		}
		return avg;
	}
	
public static int arrayIntAvgSum(int[] array) {
		
		int avg = 0;
		int i = 0;
		
		for (int sum : array) {
			array[i] += sum;
			avg += sum;
			i++;
		}
		return avg / array.length;
	}

public static int arrayIntSum(int[] array) {
	
	int newSum = 0;
	int i = 0;
	
	for (int sum : array) {
		array[i] += sum;
		newSum += sum;
		i++;
	}
	return newSum;
}
	
	public static int avG (int a) {
		
		int [] arrayUsed = arrayIntAge(a);
		int avg = arrayIntAvgSum(arrayUsed);
		return avg;
	}
	
public static double[] arrayDoubAge(boolean a) {
		
		double[] ages = new double[9];
			ages[0] = 95.2;
			ages[1] = 9.7;
			ages[2] = 23.5;
			ages[3] = 64.98;
			ages[4] = 2.1;
			ages[5] = 8.93;
			ages[6] = 28.28;
			ages[7] = 93.8;
			ages[8] = 86.2;
			
		return ages;
	}

	public static double[] arrayDoubDeci(boolean a) {
	
		double[] deci = new double[9];
			deci[0] = 94.2;
			deci[1] = 9.7;
			deci[2] = 23.5;
			deci[3] = 64.98;
			deci[4] = 2.1;
			deci[5] = 8.93;
			deci[6] = 28.28;
			deci[7] = 93.8;
			deci[8] = 85.2;
		
		return deci;
}
	
	public static int[] arrayIntAge (int a) {
		
		int[] ages = {};
		
		if ( a == 8 ) {
			int size = a;
			ages = new int[size];
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
			
		} else if ( a == 9) {
			int size = a;
			ages = new int[size];
			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
			ages[8] = a + 2;
						
			}
		return ages;
	}
	
	
	
	public static String[] names (boolean a) {
		
		String[] listOfNames = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		String[] names = new String[6];
		
		for (int i = 0; i < 6; i++) {
			names[i] = listOfNames[i];
		}
		
		return names;
	}
	
	public static int avgChar (boolean a) { //Need to print the average letter per name
		
		String[] namesUsed = names(true); //Calls the existing list of names
		int amount = 0;
		
		for (int j = 0; j < namesUsed.length; j++) {	//Assigns each name a number of length
			amount += namesUsed[j].length();
		}
		
		return amount/6;
	}
	
	public static String concatNames (boolean a) {
		
		String[] namesUsed = names(true);
		String newString = "";
		
		for (int i = 0; i < namesUsed.length; i++) {
			newString += namesUsed[i];
		}
		
		return newString;
	}
	
	public static int[] nameLengths(boolean a) {
		
		String[] namesUsed = names(true);
		int[] amount = new int[namesUsed.length];
		
		for (int i = 0; i < namesUsed.length; i++) {	
			amount[i] += namesUsed[i].length();
		}
		
		return amount;
	}
	
	public static int nameSum(boolean a) {
		
		int[] nameLengths = nameLengths(true);
		
		int sum = arrayIntSum(nameLengths);
		return sum;
	}
	
	public static String repeat(String word, int n) {
		
		String b = "";
		
		for (int i = 0; i < n; i++) {
			b += word;
		}
		return b;
	}
	
	public static String nameEntry(String fName, String lName) {
		
		return fName + " " + lName;
	}
	
	public static boolean checkArray(boolean a) {
		
		int[] usedArray = arrayIntAge(9);
		int avg = arrayIntAvgSum(usedArray);

		if (avg > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double doubArrayAvg(boolean a) {
		
		double[] usedArray = arrayDoubAge(true);
		double value = arrayDoubAvgSum(usedArray);
		double avg = value / usedArray.length;
		return avg;
		
	}
	
	public static boolean twoDoubArrayEntry(boolean a) {
		
		double[] first = arrayDoubAge(true);
		double[] second = arrayDoubDeci(true);
		
		double value1 = arrayDoubAvgSum(first);
		double value2 = arrayDoubAvgSum(second);
		
		if (value1 > value2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int[] sequenceNumber(int a) {
		
		int[] fibonacciSequence = new int [a];
		int i = 2;
		
		fibonacciSequence[0] = 1;
		fibonacciSequence[1] = 1;
		
		do {
			fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
			i++;
		} while (i < a);
		
		return fibonacciSequence;
	}
	
	public static void number(int a) {
		
		int[]fs = sequenceNumber(a);
		
		for (int i = 0; i < a; i++) {
			System.out.print(fs[i] + ", ");
		}
	}
	
//Whole package below this
}
