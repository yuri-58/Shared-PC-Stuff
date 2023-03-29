package workSpace;

import java.util.Scanner;
import java.lang.Math;

public class testExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		
		System.out.println(seqPi(a));
		
	}
	
	public static String seqPi(int a) {
		
		double pie = thePi(true);
		String pid = String.valueOf(pie);
		String theReturn = "Index found at " + pid.indexOf(a);
		System.out.println(pid);
		return theReturn;
		
		
	}
	
	public static double thePi(boolean a) {
		
		double r = 7;
		double c = 43.982297150257105338477007365913040378760371591251481493649224292;
		double pi = c / (2 * r);
		return pi;
	}
	
	
	
}
