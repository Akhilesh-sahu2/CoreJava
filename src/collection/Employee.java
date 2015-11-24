package collection;

public class Employee implements Comparable<Employee> {

	private String empName;
	private String address;
	private String dept;
	private int empAge;
	private int sallery;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSallery() {
		return sallery;
	}
	public void setSallery(int sallery) {
		this.sallery = sallery;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	@Override
	public int compareTo(Employee o) {
		 if(this.getSallery() == o.getSallery())
				return 0;
		 else if(this.getSallery() > o.getSallery())
			return 1;
		 else
			return -1;
	}
	
	
}
