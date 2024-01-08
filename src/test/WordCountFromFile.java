package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	    	
	    	
//	    	public static void main(String[] args) {
	            String s1 = "hello";
	            String s2 = new String("hello");
	            String s3 = "hello";
	            if (s1 == s2) {
	                System.out.println("s1 and s2 equal"); 
	            } else {
	                System.out.println("s1 and s2 not equal");
	            }
	            if (s1 == s3) {
	                System.out.println("s1 and s3 equal");
	            } else {
	                System.out.println("s1 and s3 not equal");
	            }
	            
	            List<String>  ls = new ArrayList()   ; 
	            
	            ls.add("Steeve");
	            ls.add("US");
	            ls.add("30") ;
	            System.out.println(ls) ;
	            Map<Integer , Object> map = new HashMap<>() ; 
	            
	            map.put(15,ls ) ;
	    		
	            System.out.println(map.get(15));
	            for(Map.Entry<Integer , Object> ent :map.entrySet() ) {
	            	System.out.println("Key: "+ ent.getKey() +"Value: "  +ent.getValue());
	            }
	            map.forEach((i,j)->System.out.println("Key: "+i +" Value: "+ j));
//	    		S1 -> Hello constant pool 
//	    		s2 -> hell0 constant pool 
//	    		
//	    		public static void main(String[] args) {
//	            String s = new String("5");
//	            System.out.println(1 + 10 + s + 1 + 10); 115110 
	        
	    }
	}}

