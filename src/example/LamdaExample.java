package example;

interface Drawable{
	public void draw();
}
public class LamdaExample {

	public static void main(String[] args) {
		int length=10;
		Drawable d2=()->{System.out.println("Drawing "+length);};  
        d2.draw();  
	}
}
