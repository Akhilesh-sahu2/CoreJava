package example;

import java.util.Date;

public final class ImmutableExample {
	private static int count=0;
	private final String name;
	private final String age;
	private final Date dateOfBirth;
	
	public ImmutableExample(String name, String age, Date dateOFBirth){
		count++;
		this.name = name;
		this.age = age;
		this.dateOfBirth =new Date(dateOFBirth.getTime());
	}
	
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public Date getDateOfBirth() {
		return (Date)dateOfBirth.clone();
	}

	public static void main(String[] args) {
		
		String s1=new String("Akhil");
		
		String s2=new String("Akhil");
		System.out.println(s1==s2);
		s1=s2;
		System.out.println(s1==s2);
		ImmutableExample immutableExample1 = new ImmutableExample("Akhil","33",new Date(System.currentTimeMillis()));
		System.out.println("count 1--  "+count);
		System.out.println("ImmutableExample 1 name "+immutableExample1.getName());
		System.out.println("ImmutableExample 1 age "+immutableExample1.getAge());
		System.out.println("ImmutableExample 2 date "+immutableExample1.getDateOfBirth());
		ImmutableExample immutableExample2 = new ImmutableExample("Akhil 2","31",new Date(System.currentTimeMillis()));
		System.out.println("count 2--  "+count);
		System.out.println("ImmutableExample 2 name "+immutableExample2.getName());
		System.out.println("ImmutableExample 2 age "+immutableExample2.getAge());
		System.out.println("ImmutableExample 2 date "+immutableExample2.getDateOfBirth());
		
		immutableExample1 = immutableExample2;
		System.out.println("count 3--  "+count);
		System.out.println(immutableExample1==immutableExample2);
		System.out.println(immutableExample1.equals(immutableExample2));
		
		System.out.println("ImmutableExample 3 name "+immutableExample1.getName());
		System.out.println("ImmutableExample 3 age "+immutableExample1.getAge());
		System.out.println("ImmutableExample 3 date "+immutableExample1.getDateOfBirth());
		
		System.out.println("ImmutableExample 4 name "+immutableExample2.getName());
		System.out.println("ImmutableExample 4 age "+immutableExample2.getAge());
		System.out.println("ImmutableExample 4 date "+immutableExample2.getDateOfBirth());
		
		
	}

}
