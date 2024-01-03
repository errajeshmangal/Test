package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class addNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the Array Limit :");
//		int l = input.nextInt();
//		int[] a = new int[l];
		
		Integer[] a = {4,5,6,7,-4,-5,-6,-7} ;
		int sum = 0;
		int sum1 = 0;

		for (int p : a) {
			if (p < 0)
				sum = sum + p;
		}
		for (int p : a) {
			if (p > 0) {
				sum1 = sum1 + p;
			}
			
		}
		Integer[] arr = new Integer[2] ;
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr)) ;
			  list.add(sum);
			  list.add(sum1) ;
			arr =   	list.toArray(arr);
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(a));	
			
			System.out.println( a);	
		int[] arr2 = { sum, sum1 };
		System.out.println(arr2);
		System.out.println("Sum of Positive Array Elements : " + sum1);
		System.out.println("Sum of Negative Array Elements : " + sum);
//+++++++++++++++++++++++++++++++++++++++++++++

//		int[] arr = {1,-1,2,-2,4,-4,5,-5} ;
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("Element of a[%d] :", i);
//			a[i] = input.nextInt();
//		}
//		for (int p : a) {
//			if (p < 0)
//				sum = sum + p;
//		}
//		System.out.println("Sum of Negative Array Elements : " + sum);
//
//	}
	}

}
