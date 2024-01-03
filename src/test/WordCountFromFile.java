package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFromFile {
	    public static void main(String[] args) {
	        String fileName = "your_file_path_here.txt"; // Replace with the actual file path
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));
	            String line;
	            int wordCount = 0;

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }

	            reader.close();

	            System.out.println("Number of words in the file: " + wordCount);
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}

