package example;

public class SwapingOf2Nos {

	public static void main(String[] args) {
	int firstNos=10,secondNos=20;
	System.out.println("before Swaping");
	System.out.println("firstNos = "+firstNos+" Second Nos = "+secondNos);
	firstNos = firstNos*secondNos;
	secondNos = firstNos/secondNos;
	firstNos = firstNos/secondNos;
	System.out.println("after Swaping");
	System.out.println("firstNos = "+firstNos+" Second Nos = "+secondNos);
	

	}

}
