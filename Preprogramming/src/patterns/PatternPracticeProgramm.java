package patterns;

public class PatternPracticeProgramm {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("Upper pyramid");
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1&&j-i<=n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Down pyramid");
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(j>=i&&i+j<=n*2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Left pyramid");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j&&i+j<=n*2) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println("Right pyramid");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1&&i-j<=n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("Butterfly pattern");
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if((j<=i&&i+j<=n*2)||(i<=j&&i+j>=n*2)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Diamond pattern");{
			for(int i=1;i<=n*2-1;i++ ) {
				for(int j=1;j<=n*2-1;j++) {
					if((i+j>=n+1&&j-i<=n-1)&&(i-j<=n-1&&i+j<=n*2+3)) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
		}
		
		
	}

}
