package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class missingNumberinArray {
	
	public static void main(String[] args) {
int[] arr = {1, 2, 4, 5, 6};
int n = arr.length + 1;
int sum = n * (n + 1) / 2;
System.out.println(sum);
int missingNumber = sum ;
for (int i = 0; i < arr.length; i++) {
    missingNumber =missingNumber- arr[i];
    System.out.println(missingNumber);
}
if (missingNumber == n) {
    System.out.println("-1");
} else {
    System.out.println("Missing number is " + missingNumber);
}
}
}