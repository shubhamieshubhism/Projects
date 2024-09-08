package numberPackage;

public class SunnyNumber {
	//sunny number is a number after number having perfect squareroot

	public static void main(String[] args) {
		
		int n=3;
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if(i*i==n+1) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("sunny number");
		}else {
			System.out.println("Not a sunny number");
		}
		
		int m =3,m1=m+1,root=0;
		for(int j=1;j<=m1/2;j++) {
			if(j*j==m1) {
				root=1;
				break;
			}
		}if(root==1) {
			System.out.println("sunny number");
		}else {
			System.out.println("not a sunny number");
		}
	}
}

