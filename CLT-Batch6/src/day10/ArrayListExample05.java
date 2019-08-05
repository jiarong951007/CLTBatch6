package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee {
	String name;
	int age; 
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
    public int getAge() {
		return age;
		}
    
    private String getName() {
    	return name; 

	}
    
    @Override
    public String toString() {
    	return name + ""+age;
}

public class ArrayListExample05 {

	public static void main(String[] args) {
		
		List refList = new ArrayList();
		refList.add(new Employee("Charles", 20));
		refList.add(new Employee("John", 30));
		refList.add(new Employee("Adam", 40));
		refList.add(new Employee("Nick", 5));
		
	//sort by Name
		Collection.sort(refList, new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
			return o1.getName(),compareTo(o2.getName());
		//end of sort
			
			
			Iterator itr = refList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
				// sort by age
				Collection.sort(refList, new Comparator<Employee>() {
					
					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getAge() - o2.getAge(); //int ==> we use - 
					}
				}}; //end of sort
				System.out.println("/n");
				Iterator itr2 = refList.iterator();
				while(itr2.hasNext()) {
					System.out.println(itr2.next());
				}  end of Iterator
					}}
				
