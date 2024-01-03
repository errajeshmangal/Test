package test;

import java.util.HashMap;
import java.util.Map;

public class findsWordsinString {
	
	public static void name() {
		
 
	String inputString = "This is a simple example of counting words using a HashMap." ;
    String[] words = inputString.split("\\s+") ; // Split the string into words

    Map<String, Integer> wordCountMap = new HashMap<String ,Integer>() ;

    for (String word : words) {
        // Remove punctuation marks and convert to lowercase for consistent counting
        String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (!cleanedWord.isEmpty()) {
            // If the cleaned word is not empty, update the word count in the map
            wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);
        }
    }

    // Display the word counts
    System.out.println("Original String: " + inputString);
    System.out.println("Word Counts:");
    for (String word1 : wordCountMap.keySet()) {
        System.out.println(word1 + ": " + wordCountMap.get(word1));
    }
}}
 