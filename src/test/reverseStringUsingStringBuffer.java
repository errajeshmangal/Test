package test;

public class reverseStringUsingStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My Name is Rajesh" ; 
		
		StringBuffer str = new StringBuffer(s); 
		
		String revrserString = str.reverse().toString() ;
		System.out.println(revrserString);
		
		
	}

}
