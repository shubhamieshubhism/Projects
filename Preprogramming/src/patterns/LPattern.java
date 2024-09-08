package patterns;

public class LPattern {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==n){
					System.out.print("* ");
				}	
			}
			System.out.println();
		}
		
		//ulta l
		/**
		 *  ****
		 *     *
		 *     *
		 *     *
		 */
		int m=4;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(j==m||i==1){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
