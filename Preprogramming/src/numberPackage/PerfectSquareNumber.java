package numberPackage;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		int n=10;
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if(i*i==n) {
				flag=true;
				System.out.println("Root of "+n+" is "+i);
				break;
			}
		}
		if(flag==true) {
			System.out.println("Perfect number");
		}else {
			System.out.println("Not a perfect number");
		}

	}

}
