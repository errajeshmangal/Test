package test;


public class RemoveCommonCharacters {
    public static String removeCommonChars(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        String str[] ; 
        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            
            // Check if the current character is not present in the second string
            if (str2.indexOf(currentChar) == -1) {
                result.append(currentChar);
         }
//            
//            if(str2.charAt(i) != str1.charAt(i)) {
//            	StringBuilder strb = new StringBuilder(); 
//            	strb = strb.append(str2.charAt(i)) ; 
//            	System.out.println(strb);
//            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String firstString = "hello";
        String secondString = "world";
        
        String modifiedString = removeCommonChars(firstString, secondString);
        
        System.out.println("First String: " + firstString);
        System.out.println("Second String: " + secondString);
        System.out.println("Modified String: " + modifiedString);
    }
}
