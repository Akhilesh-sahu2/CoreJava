package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArmstrongNumber {

	/**
	 * An Armstrong number of three digits is an integer such that the sum of the cubes 
	 * of its digits is equal to the number itself. For example, 371 is an Armstrong number 
	 * since 3**3 + 7**3 + 1**3 = 371.
	 */
	public static void main(String[] args) {
				int number=0;
		   		System.out.println("Please enter the input for which you like to check Armstrong number");
		   		Scanner in = new Scanner(System.in);
		   	 	number = in.nextInt();
		   	 	int sumOfCubeofDigit=0;
		   	 	int enterdNumber=number;
		   	 while( number != 0 )
		        {
		   		 	
		           int digit= number%10;
		            sumOfCubeofDigit = sumOfCubeofDigit +(digit*digit*digit);
		   		 	number = number/10;
		        }
		   	 if(sumOfCubeofDigit==enterdNumber){
		   		System.out.println(enterdNumber+" is an armstrong number");
		   	 }else{
		   		System.out.println(enterdNumber+" is not an armstrong number");
		   	 }

	}

}
