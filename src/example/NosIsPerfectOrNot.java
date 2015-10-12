package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NosIsPerfectOrNot {

	/**
	 * Perfect number, a positive integer that is equal to the sum of its proper divisors. 
	 * The smallest perfect number is 6, which is the sum of 1, 2, and 3. 
	 * Other perfect numbers are 28, 496, and 8,128.
	 */
	public static void main(String[] args) throws IOException{
		int number = 0;
		   System.out.println("Please enter the input for which you like to check perfect number");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));		
			try {
				number = Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				number = 0;
			}
			
			int sumOfFactor=0;
			
			for(int count = number-1;count >=1 ;count--){
				if(number%count==0)
					sumOfFactor = sumOfFactor +count;
			}
			if(sumOfFactor==number)
				System.out.println(number+" is a perfect number");
			else
				System.out.println(number+" is not a perfect number");
		
		
	}

}
