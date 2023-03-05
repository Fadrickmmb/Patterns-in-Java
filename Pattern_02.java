package Patterns;

public class Pattern_02 {

	public static void main(String[] args) {
		
		
		
		// PATTERN 02 //
		
/*
 		
 	* * * * *
 	* * * *
 	* * *
 	* *
 	* 
 	

*/
 
 

		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
