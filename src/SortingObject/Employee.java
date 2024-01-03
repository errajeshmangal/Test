package SortingObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	
	 int age;
	  int salary;
	  String name;
	  
	  Employee(String name, int age, int salary) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	  }
	  
	  public String getName() {
	    return this.name;
	  }
	  
	  public int getAge() {
	    return this.age;
	  }
	  
	  public int getSalary() {
	    return this.salary;
	  }
	  
	  @Override
	  public int compareTo(Employee employee) {
	    return this.age - employee.age;
	  }
	  
	  public String toString() {
	    return this.name + " " + this.age + " " + this.salary;
	  }
	}

	class AgeComparator implements Comparator<Employee> {
	   
	  @Override
	  public int compare(Employee emp1, Employee emp2) {
	      return emp1.getAge() - emp2.getAge();
	  }
	}

	class SalaryComparator implements Comparator<Employee> {
	   
	  @Override
	  public int compare(Employee emp1, Employee emp2) {
	      return emp1.getSalary() - emp2.getSalary();
	  }
	}

	class NameComparator implements Comparator<Employee> {
	   
	  @Override
	  public int compare(Employee emp1, Employee emp2) {
	      return emp1.getName().compareTo(emp2.getName());
	  }
	

	
}
