
package com.org.pra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.Element;

public class Student {

	Integer id;

	String name;

	public Student(int id, String name) {

		super();

		this.id = id;

		this.name = name;

	}

	@Override

	public String toString() {

		return "Student [id=" + id + ", name=" + name + "]";

	}

	public static void main(String[] args) {

		Student s1 = new Student(4, "ABC");

		Student s2 = new Student(9, "PQR");

		Student s3 = new Student(6, "ABC");

		Student s4 = new Student(8, "ERT");

		ArrayList<Student> arrList = new ArrayList<Student>();

		arrList.add(s1);

		arrList.add(s2);

		arrList.add(s3);

		arrList.add(s4);

		System.out.println(arrList);

		List<Student> ls = arrList.stream().sorted().collect(Collectors.toList());

		System.out.println(ls);

//String str = "Rajesh Mangal" ;
//
//
//for(int i = 0 ; i< str.length(); i++) {
//	
//	
//	 
//	 
//	str.charAt(0) ;
//}
//
// 	JavascriptExecutor js = JavaScriptExecutor(Driver) ;
// 	
// 	js.executeScript(Element. = "test")
//

	}

}