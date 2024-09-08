package numberPackage;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// WAJP to check given number is armstrong number
		// or not
		// sum of power of each digit is equals to
		// given number

		// 1.count the digits in given number
		
	 
		int n = 153, n1 = n, temp = n;
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;

		}
		//System.out.println("count is : " + count);

		// 2. find the power of each digit
		int sum = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			// 3*3*3
			int power = 1;
			for (int i = 1; i <= count; i++) {
				power = power * rem;
			}
			// sum the power
			sum = sum + power;
			n1 = n1 / 10;
		}
		//System.out.println("sum is: " + sum);
		// 3. compair sum with given number
		if (sum == temp) {
			System.out.println("armstring number : "+sum);
		} 
	}

}

