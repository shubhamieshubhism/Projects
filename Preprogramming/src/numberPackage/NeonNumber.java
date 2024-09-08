package numberPackage;

public class NeonNumber {
	//Write a java program to check that the given
	//number is neon number or not

	public static void main(String[] args) {
		int n=9;
		int square=n*n;
		int sum=0;
		while(square>0) {
			sum+=square%10;
			square/=10;
		}if(sum==n) {
			System.out.println("neon number");
		}else {
			System.out.println("not a neon number");
		}
}
}

//wrtie a java program to check that the given
//number is buzz or not