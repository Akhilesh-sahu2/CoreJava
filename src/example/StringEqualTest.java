package example;

public class StringEqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Akhil"; 
		String s2 = "Akhil";
		String s3 = new String("Akhil"); 
		String s4 = new String("Akhil"); 
		System.out.print("s1.equals(s2)  = ");
		System.out.println(s1.equals(s2));
		System.out.print("s1==s2  = ");
		System.out.println(s1==s2);
		System.out.print("s3.equals(s4)  = ");
		System.out.println(s3.equals(s4));
		System.out.print("s3==s4  = ");
		System.out.println(s3==s4);
		System.out.print("\"\"s1==s2  = ");
		System.out.println(""+s1==s2);
	}

}
