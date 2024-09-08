package loopingstatements;

public class NestedLoop {

	public static void main(String[] args) {
		/*for(int j=1;j<=2;j++) {
			
		
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
		
		for(int j=1;j<=4;j++) {
			
			
			for(int i=1;i<=4;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			}*/
		//whenever you are declaring the variable 
		//inside the loop it is reinitialize with one 
		//after the condition is fulfilled.
		 int size = 4;

	        for (int i = 1; i <= size; i++) {
	            for (int j = 1; j <= size; j++) {
	                // Print a star if it is the first or last row or column, otherwise print a space.
	                if (i == 1 || i == size || j == 1 || j == size) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
		 
		 
	}

}
