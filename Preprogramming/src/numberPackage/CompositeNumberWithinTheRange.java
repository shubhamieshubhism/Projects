package numberPackage;

public class CompositeNumberWithinTheRange {

	public static void main(String[] args) {
		System.out.println("composite number are");
		for (int n = 1; n <= 20; n++) {
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count > 2) {
				System.out.println(n);
			}
		}

	}

}
