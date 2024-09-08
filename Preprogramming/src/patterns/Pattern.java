package patterns;

public class Pattern {

	public static void main(String[] args) {
		/*for(int j=1;j<=4;j++) {
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
			
		}
		System.out.println();
		}*/
		
		//outer loop traverse the row
		//inner loop for column
		
		/*//opposite l pattern
		
		for(int i=1;i<=4;i++) //this is for traversing rows
		{
			for(int j=1;j<=4;j++) //this is for traversing columns
			{
				if(i==1 || j==4) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		
		
		//box pattern
		for(int i=1;i<=4;i++) //this is for traversing rows
		{
			for(int j=1;j<=4;j++) //this is for traversing columns
			{
				if(i==4 || j==1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
