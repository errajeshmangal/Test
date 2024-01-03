package test;

public class rightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int a, b;
//+++++++++ print right angle triangle 
		
//		for (a = 0; a < n; a++) {
//			System.out.println();
//			for (b = 0; b <= a; b++) {
//			
//				System.out.print("*");
//				
//			}
		
//			*
//		    **
//		    ***
//	     	****
		
//		++++++++++++++++ print left angle triangle 
		
		for (a = 0; a < n; a++) {
			//inner loop work for space      
			for (b=2*(n-a); b>=0; b--)         
			{  
			//prints space between two stars      
			System.out.print(" ");   
			}   
			//inner loop for columns  
			for (b=0; b<=a; b++ )   
			{   
			//prints star      
			System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
		}
		

//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
		
//++++++++++++++++ print left angle triangle 
		
		for (a = 0; a < n; a++) {
			//inner loop work for space      
			for (b=(n-a); b>=0; b--)         
			{  
			//prints space between two stars      
			System.out.print(" ");   
			}   
			//inner loop for columns  
			for (b=0; b<=a; b++ )   
			{   
			//prints star      
			System.out.print("* ");   
			}   
			//throws the cursor in a new line after printing each line  
			System.out.println();   
		}
	}
 
	
}
