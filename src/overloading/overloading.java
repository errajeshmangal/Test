package overloading;

public class overloading {

	 public static void printData(Object data) {
	        System.out.println("Object");
	    }
	 
	    // Method to print the data with a String parameter
	    public static void printData(String data) {
	        System.out.println("String");
	    }
	 
	    public static void main(String[] args) {
	        printData(null);
	        
	        try{
		        int I=10/0;
	}catch(Exception e){
		        e.printStackTrace();	
	}catch(ArithmeticException e){
		        e.printStackTrace();	
	}
	        
	        
	    }
	
	
	
	
	
	
	
	
}
