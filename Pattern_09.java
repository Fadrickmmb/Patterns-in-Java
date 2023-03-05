package Patterns;

public class Pattern_09 {

	public static void main(String[] args) {
	
		
		// PATTERN 09 //
		
/*
		 		*
		      * * *
		    * * * * *
		  * * * * * * *
		* * * * * * * * *
		  * * * * * * *
		    * * * * *
		      * * *
		        *
 	
*/


		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j < i; j++) {
			System.out.print("* ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j < n; j++) {
			System.out.print("* ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
