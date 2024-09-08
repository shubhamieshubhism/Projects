package numberPackage;

public class CountEven_Odd_digit {

	public static void main(String[] args) {
		int num=56724;
		int even=0,odd=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even++;
			}else {
				odd++;
			}
			num=num/10;
		}
		System.out.println("count of even digit is : "+even);
		System.out.println("count of odd digit is : "+odd);

	}

}
