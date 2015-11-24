package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComparatorExample {
	
	public List<Employee> getEmployeeList(int size){
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp;
		Random rnd = new Random();
		for(int i=0;i<size;i++){
			emp = new Employee();
			emp.setEmpName("Employee "+i);
			emp.setAddress("Address "+i);
			emp.setDept("Dept "+i);
			emp.setEmpAge(rnd.nextInt(50));
			emp.setSallery(rnd.nextInt(100000));
			empList.add(emp);
		}		
		return empList;
	}

	public static void main(String[] args) {
		ComparatorExample comparatorExample = new ComparatorExample();
		List<Employee> empList = comparatorExample.getEmployeeList(6);
		System.out.println("--Size "+empList.size());
		System.out.println("-----------------Before Sorting------------------");
		comparatorExample.printList(empList);
		AgeComparator ageComparotr = new AgeComparator();
		Collections.sort(empList,ageComparotr);
		System.out.println("------------------After Sorting------------------");
		comparatorExample.printList(empList);

	}
	
	public void printList(List<Employee> empList){
		for(Employee emp:empList){
			System.out.println("-------------------------------------------------------------");
			System.out.println("Employee Name "+emp.getEmpName());
			System.out.println("Employee Address "+emp.getAddress());
			System.out.println("Employee Dept "+emp.getDept());
			System.out.println("Employee Age "+emp.getEmpAge());
			System.out.println("Employee Salery "+emp.getSallery());
			System.out.println("-------------------------------------------------------------");
		}
	}

}
