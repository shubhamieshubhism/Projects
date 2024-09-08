package numberPackage;

public class StrongMNumber {

	public static void main(String[] args) {
		int n = 145;
		int sum = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			int fact = 1;

			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}

			sum = sum + fact;
			n /= 10;
		}
		if (temp == sum) {
			System.out.println("strong number");
		} else {
			System.out.println("not a strong number");
		}

	}

}
