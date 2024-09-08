package numberPackage;

public class Palindrome {

	public static void main(String[] args) {
		int rev = 0;
		int num = 123321;
		int temp = num;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
			
			
		}
		if(rev==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		System.out.println(rev);
		

	}

}
