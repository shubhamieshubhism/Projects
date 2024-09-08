package numberPackage;

public class AutomorphicNumbeer {

	public static void main(String[] args) {
		// write a java program to check the 
		// given number is automorphic number or not
		//autoorphic number=given number is present at last at the number.
		
		int n=25,sq=n*n;//625
		while(n>0) {
		int r1=n%10;
		int r2=sq%10;
		if(r1==r2) {
			n=n/10;
			sq=sq/10;
		}
		else {
			break;
		}
		}
		if(n==0) {
			System.out.println("automorphic");
		}
		else {
			System.out.println("not a automorphic number");
		}
		}

	}


