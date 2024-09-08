package numberPackage;

public class FibonacciSeriesForRange500_2000 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum;
		int st = 500, en = 2000;
		for (int i = st; i <= en; i++) {
			if (n1 >= 500 && n1 <= 2000) {
				System.out.print(n1 + " ");
			}
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}

	}

}
