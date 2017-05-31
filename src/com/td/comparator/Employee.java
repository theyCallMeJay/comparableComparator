package com.td.comparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int d;
	private String name;
	private int age;
	private long salary;
	
	public Employee(int d, String name, int age, long salary) {
		super();
		this.d = d;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [d=" + d + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return (int) (this.salary - emp.getSalary());
	}
	
	
	//comparator example, compare age
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub(
			return o1.getAge() - o2.getAge();
		}
	};
	
	//comparator example, compare id and name
	public static Comparator<Employee> IdAndSalaryComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			int flag = o1.getD() - o2.getD();
			if (flag == 0) {
				flag = (int) (o1.getSalary()-o2.getSalary());
			}
			
			return flag;
		}
	};
	
}
