package numberPackage;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int rev = 0;
		int num = 1234;
		int temp=num;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		System.out.println(rev);
		System.out.println(temp);
	}
}
//extract the last digit
//rev=rev*10+rem
//remove the last digit 