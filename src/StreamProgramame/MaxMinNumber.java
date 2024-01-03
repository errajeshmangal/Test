package StreamProgramame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {

	  public static void main(String[] args) {
		  
		  
//		  String s = "Rajesh is Selfish " ;
//		  Comparator<Character> c1 = (i1,i2)->i2.compareTo(i1);
//		  s.chars().mapToObj(c->(char)c).sorted(c1).forEach(System.out::print)) ;
		  
		  ArrayList<Integer> l1 = new ArrayList<Integer>();
		  
		  	l1.add(11);
		  	l1.add(12);
		  	l1.add(13);
		  	l1.add(14);
		  	l1.add(1);
		  	l1.add(41);
		  	
		  	l1.stream().forEach(System.out::println);
		Integer max =  	 l1.stream().max((i1,i2)->i1.compareTo(i2)).get();
		Integer min =  	 l1.stream().min((i1,i2)->i1.compareTo(i2)).get();	 
		System.out.println(min );
		System.out.println(max );
	  }
	

	   
	  
	  
}



