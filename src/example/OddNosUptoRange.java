package example;

public class OddNosUptoRange {

	public static void main(String[] args) {
		//Odd number is 2n+1;
		int n=21;
		System.out.println("Odd nos upto "+n);
		for(int i=0;i<=n;i++){
			if(i%2!=0)
			System.out.println(i);
		}

	}
	
}
