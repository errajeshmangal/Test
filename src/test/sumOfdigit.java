package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sumOfdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number = 2345;
//
//		int r, sum = 0;
//
//		while (number > 0) {
//
//			r = number % 10;
//			System.out.println("r" + r);
//			sum = sum + r;
//			System.out.println("sum" + sum);
//			number = number / 10;
//			System.out.println("number" + number);
//		}
//
//		System.out.println("Sum of digits :" + sum);
		
		
//		++++++++++++++++++++++++++++++++
//		   String str = "11Raj22FFF20";
//	        char[] array = str.toCharArray();
//	        int sum = 0;
//	        String temp = "";
//	        for (int i = 0; i < array.length; i++) {
//	            char c = array[i];
//	            if (Character.isDigit(c)) {
//	            	System.out.println("Digit" + c);
//	                temp =temp + c;
//	                System.out.println("temp" + temp);
//	            } else {
//	                if (temp != "") {
//	                    sum += Integer.valueOf(temp);
//	                    System.out.println("Sum" + sum);
//	                    temp = "";
//	                }
//	            }
//	        }
//	        if (temp != "") {
//	          sum += Integer.valueOf(temp);
//	        }
//	        System.out.println(sum);
//	        +++++++++++++++++++++++++++++++++++++
		
		
//		 int [] arr = new int [] {1, 2, 3, 4, 5};  
//	        //n determine the number of times an array should be rotated  
//	        int n = 3;  
//	        //Displays original array  
//	        System.out.println("Original array: ");  
//	        for (int i = 0; i < arr.length; i++) {  
//	            System.out.print(arr[i] + " ");  
//	        }  
//	        //Rotate the given array by n times toward left  
//	        for(int i = 0; i < n; i++){  
//	            int j, first;  
//	            //Stores the first element of the array  
//	            first = arr[0];  
//	            for(j = 0; j < arr.length-1; j++){  
//	                //Shift element of array by one  
//	                arr[j] = arr[j+1];  
//	            }  
//	            //First element of array will be added to the end  
//	            arr[j] = first;  
//	        }  
//	        System.out.println();  
//	        //Displays resulting array after rotation  
//	        System.out.println("Array after left rotation: ");  
//	        for(int i = 0; i< arr.length; i++){  
//	            System.out.print(arr[i] + " ");  
//	        
//	    }  
		
//		++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 
//  Sort the Array in Ascending 
		
		List<Integer>   alphabets1 = Arrays.asList(0,0,1,1,0,0);
		
		List<Integer>   sortedAlphabets = alphabets1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedAlphabets);
		 
//		+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		  List<String> alphabets = Arrays.asList("E", "A", "G", "P", "L");  
		   List<String> reverseSortedAlphabets = alphabets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
		   reverseSortedAlphabets.forEach(item->System.out.print(item)); 
		   System.out.println(reverseSortedAlphabets);
		   List<String> sortedAlphabets1 = alphabets.stream().sorted().collect(Collectors.toList());
		   System.out.println(sortedAlphabets1);
		   
		   
//		   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		   
		
	}

}
