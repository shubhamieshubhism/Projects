package patterns;

public class UpperPyramidAndButterfly {

	public static void main(String[] args) {
		/**
		 *      
	  *	 *            
    * * *     
  * * * * *   
* * * * * * * 
		 */
		int n=4;
		System.out.println(".....upper pyramid....");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++){
				if(i+j>=n+1&&j-i<=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("...down pyramid....");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++){
				if(j>=i&&i+j<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		
		System.out.println("....left pyramid....");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++){
				if(i>=j&&i+j<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("....right pyramid....");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++){
				if(i+j>=n+1&&i-j<=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("....Butterfly....");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++){
				if((i>=j&&i+j<=n*2)||(i+j>=n*2&&j>=i)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		
		
		System.out.println("....Diamond pattern....");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++){
				if((i+j>=n+1&&j-i<=n-1)&&(i-j<=n-1&&i+j<=n*3-1)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}
