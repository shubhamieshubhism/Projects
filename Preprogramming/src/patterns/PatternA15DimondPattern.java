package patterns;

public class PatternA15DimondPattern {

	public static void main(String[] args) {
		int n=8;
		for(int i = 1;i<=n*2;i++) {
			for(int j=1;j<=n*2;j++) {
				if(i+j<=n+1||j-i>=n||i-j>=n||i+j>=n*3+1) {
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
