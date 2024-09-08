package numberPackage;

public class CompositeNumber {

	public static void main(String[] args) {
		int n = 13;
		int count = 0;
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				count++;
				System.out.print(j+" ");
			}
		}

		System.out.println();
		if (count > 2) {
			System.out.println("composit number");
		} else {
			System.out.println("not a composite number");
		}

	}

}
