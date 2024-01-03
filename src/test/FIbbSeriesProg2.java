package test;

public class FIbbSeriesProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b ,c;
		a= 0 ; b= 1 ; 
		int n = 5  ; 
System.out.println(a);
System.out.println(b);
		for (int i =0 ; i <n ; i++ ) { 
		 
			c= a+b ; 
			a = b;
			b= c ; 
		 
		System.out.println(c); 
		} 

	}}


