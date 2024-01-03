package test;

import java.util.HashMap;

public class characterCounting {
 
		public static void main(String[] args)
		{
			
//			+++++++++++++++++++++++++++++++
//			int x = 08 ; 
//			x = x+2 ; 
//			System.out.println(x);
//++++++++++++++++++++++++++++++++ 
			
//			 String s1 = "HELLO";
//		        String s2 = "HELLO";
//		        String s3 =  new String("HELLO");
//		 
//		        System.out.println(s1 == s2);  true
//		        System.out.println(s1 == s3); false
//		        System.out.println(s1.equals(s2)); true
//		        System.out.println(s1.equals(s3));true
//				+++++++++++++++++++++++++++++++++++++++
//			In => "Abc Pqr Xyzz"
//
//			Out ->How many times each char is appearing
//
//			[A=1, b=1, c=1, z=2]
			
//			String str = "AAbc Pqr Xyzz" ;
//			
//			HashMap<Character , Integer> map = new HashMap<>();
//			
//			for(int i =0 ; i<str.length() ;i++) {
//				
//				char c = str.charAt(i);
//				if(map.containsKey(c)) {
//					map.put(c, map.get(c)+1);
//				}
//					
//					else {
//						map.put(c, 1);
//					}
//				
//					}
//					System.out.println(map);
//					map.stream().sort().((k,y)->System.out.println(k,y))
					
//					+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//					String S = "Rajesh12Mangal20isBestGUY30" ;
//					
//					int temp = 0 ; 
//					for(int i = 0 ; i<S.length() ; i++) {
//						
//					if(Character.isDigit(S.charAt(i))) {
//						
//						temp = temp+ Character.getNumericValue(S.charAt(i)) ;
//						
//						
//					 
//					System.out.println(temp); 
////					op// 8
//					}
//					
//					
//				}
					
//					++++++++++++++++++++++++++++++++++++++++++++
					
              String S = "Rajesh12Mangal20isBestGUY30" ;
					
					int temp = 0 ; 
					for(int i = 0 ; i<S.length() ; i++) {
					 for(int j = i+1 ; j>i; j++) {
						 
				 if(Character.isDigit(S.charAt(i))==Character.isDigit(S.charAt(j))){
					 
				 int s1 = S.charAt(i)+S.charAt(j) ;
				 System.out.println(s1);
				 
				 temp = temp+s1 ; 
//					if(Character.isDigit(S.charAt(i))) {
//						
//						temp = temp+ Character.getNumericValue(S.charAt(i)) ;
//						
//						
//					 
//					System.out.println(temp); 
////					op// 8
//					}
				 }
				 System.out.println(temp);
					 }
				}
		}}
 
 
 
