package numberPackage;

public class PerfectNumberOrNot {

	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		int temp=num;
		//System.out.println("the sum of factor of "+num);
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
				//System.out.println(i);
			}
			
		}
		if(temp==sum) {
			System.out.println("number is perfect");
		}else {
			System.out.println("number is not perfect");
		}
		//System.out.println("sum of factors is "+sum);


	}

}
