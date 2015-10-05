package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import example.HelloWorld;

public class MainClass {

	public static void main(String[] args) throws IOException {
		MainClass mainClass = new MainClass();
		
		int options = 0;
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			mainClass.printChoiceOptions();
			try {
				options = Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				options = 0;
			}
			switch (options) {
				case 1:
					System.out.print("\tPrint Hello World\n");
					HelloWorld hello = new HelloWorld();
					System.out.print("\t"+hello.printHello()+"\n");
					break;

				default:
			}
		} while (options!=0);
	}

	private void printChoiceOptions() {
		System.out.print("\t============================================================\n");
		System.out.print("\tEnter Your Choice using number\n");
		System.out.print("\t 1. Hello World\n");
//		System.out.print("\t 2. One Dimension Array pop operation\n");
//		System.out.print("\t 3. One Dimension Array print operation\n");
//		System.out.print("\t 4. Smallest element in array without sorting\n");
//		System.out.print("\t 5. Linear Search/ Sequential Search\n");
		System.out.print("\t============================================================\n");
	}
}



