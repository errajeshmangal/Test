package SortingObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingObject {

		  public static void main(String[] args) {

		
	int a[] = {7, 1, 80, 14};
	    
	    Arrays.sort(a);
	    
	    for(int i = 0; i < a.length; i++) {
	      System.out.print(a[i] + " ");
	    }
	    
	    System.out.println();
	    System.out.println("//////////////////////////////////////////////");
	    
	    Employee[] allEmp = new Employee[3];
	        
	    allEmp[0] = new Employee("Sachin", 45, 25000);
	    allEmp[1] = new Employee("Kohli", 34, 35000);
	    allEmp[2] = new Employee("Dhoni", 40, 30000);
	    
	    Arrays.sort(allEmp);
	    
	    for(int i = 0; i < allEmp.length; i++) {
	      System.out.println(allEmp[i] + " ");
	    }
	    
	    System.out.println("///////////////AgeComparator///////////////////////////");
	    
	    Arrays.sort(allEmp, new AgeComparator());
	    
	    for(int i = 0; i < allEmp.length; i++) {
	      System.out.println(allEmp[i] + " ");
	    }
	    
	    System.out.println("//////////////SalaryComparator///////////////////////");
	    
	    Arrays.sort(allEmp, new SalaryComparator());
	    
	    for(int i = 0; i < allEmp.length; i++) {
	      System.out.println(allEmp[i] + " ");
	    }
	    
	    System.out.println("//////////////NameComparator/////////////////");
	    
	    Arrays.sort(allEmp, new NameComparator());
	    
	    for(int i = 0; i < allEmp.length; i++) {
	      System.out.println(allEmp[i] + " ");
	    }
	    
	    System.out.println("//////////////////////////////////////////////");
	    
	    List<Employee> empList = new ArrayList<>();
	    
	    empList.add(new Employee("Sachin", 45, 25000));
	    empList.add(new Employee("Kohli", 34, 35000));
	    empList.add(new Employee("Dhoni", 40, 30000));
	    
	    Collections.sort(empList);
	    System.out.println(empList);
	    
	    Collections.sort(empList, new AgeComparator());
	    System.out.println(empList);

	    Collections.sort(empList, new SalaryComparator());
	    System.out.println(empList);

	    Collections.sort(empList, new NameComparator());
	    System.out.println(empList);

	  }	
}
