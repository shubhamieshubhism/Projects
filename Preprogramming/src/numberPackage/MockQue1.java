package numberPackage;

public class MockQue1 {

	public static void main(String[] args) {
		//automorphic number
		int n=76;
		int sq=n*n;
		while(n>0) {
			int r1=n%10;
			int r2=sq%10;
			if(r1==r2) {
				n/=10;
				sq/=10;
			}
			else {
				break;
			}
		
	}
		if(n==0) {
			System.out.println("Automorphic number");
		}else {
			System.out.println("not a automorphic number");
		}
}
}
