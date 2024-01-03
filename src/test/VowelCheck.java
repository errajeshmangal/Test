package test;

public class VowelCheck {

	
	  public static boolean hasVowel(String input) {
	        input = input.toLowerCase(); // Convert the input string to lowercase
	        
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            
	            // Check if the current character is a vowel
	            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
	                currentChar == 'o' || currentChar == 'u') {
	                return true; // Return true if a vowel is found
	            }
	        }
	        
	        return false; // Return false if no vowel is found
	    }
	    
	    public static void main(String[] args) {
	        String inputString = "Hello, this is a sample string.";
	        
	        if (hasVowel(inputString)) {
	            System.out.println("The string contains at least one vowel.");
	        } else {
	            System.out.println("The string does not contain any vowel.");
	        }
	    }
}
