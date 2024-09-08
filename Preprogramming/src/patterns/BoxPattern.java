package patterns;

public class BoxPattern {

	public static void main(String[] args) {
		int m=4;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=m;j++) {
				if(j==m||j==1||i==1||i==m){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
