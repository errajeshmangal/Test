package test;

import java.util.HashMap;

public class DistinctCharacterCount {
    public static void main(String[] args) {
        String inputString = "hello world";
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the input string to lowercase for case-insensitive counting
        inputString = inputString.toLowerCase();
        
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            
            // Ignore spaces and non-alphabetic characters
            if (Character.isLetter(currentChar)) {
                charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
            }
        }
        
        // Display distinct characters and their counts
        System.out.println("Distinct characters and their counts:");
        for (char key : charCountMap.keySet()) {
            System.out.println(key + ": " + charCountMap.get(key));
        }
    }
}
