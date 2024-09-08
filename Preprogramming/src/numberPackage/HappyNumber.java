package numberPackage;

public class HappyNumber {

	public static void main(String[] args) {
		// write a java program to check that
		//given number is happy number or sad
		
		/**
		 * happy nuber=sum ==1 or 4
		 */
		int n=19;
		int sum=0;
		while(n!=4&&n!=1) {
		while(n>0) {
			int rem=n%10;
			sum+=rem*rem;
			n/=10;
			
		}
		System.out.println(sum);
		if(sum==1) {
			System.out.println("happy number");
			break;
		}else if(sum==4) {
			System.out.println("sad number");
			break;
		}
		n=sum;
		System.out.println("n-->"+n);
		sum=0;
		System.out.println("sum-->"+sum);
		

	}

}
}