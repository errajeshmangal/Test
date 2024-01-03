package test;

public class Substring {

	public   static void main(String[] arg) {
	   String s = "HelloHe" ;
       
       String s1 = s.substring(0, 2) ;
       

	System.out.println("first Two CHar " + s1);

	if(s.contains(s1)) {
		
		String s2 = s.substring(2);
		System.out.println(s2);
	}
} }
