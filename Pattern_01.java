package Patterns;

public class Pattern_01 {

	public static void main(String[] args) {
		
		
		// PATTERN 01 //
		
/*		
  		*
                * *
 		* * *
		* * * *
		* * * * *
		
*/
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
