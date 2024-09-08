package numberPackage;

public class SumOfTheFactors {

	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		int temp=sum;
		System.out.println("the sum of factor of "+num);
		System.out.print("The factor are : ");
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
				System.out.print(i+" ");
			}
			
			
		}
		System.out.println();
		System.out.println("sum of factors is "+sum);

	}

}
