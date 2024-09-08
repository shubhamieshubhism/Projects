package patterns;

public class IntegerPatterns {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("----1----");
		int a=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(a + " ");
				a++;
			}

			System.out.println();
		}
		System.out.println("----2----");

		for (int i = 1; i <= n; i++) {
			int b=1;
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print(b + " ");
					b++;

				}
			}

			System.out.println();
		}

		System.out.println("----3----");
		int c=1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print(c + " ");

				} else {
					System.out.print("  ");
				}
			}
			c++;

			System.out.println();
		}

		System.out.println("----4----");
		
		for (int i = 1; i <= n; i++) {
			int d=1;
			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1) {
					System.out.print(d + " ");
					d++;

				} else {
					System.out.print("  ");
				}
			}
			d++;

			System.out.println();
		}

		System.out.println("----5----");
		int e=4;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i + j <= n + 1) {
					System.out.print(e + " ");

				} else {
					System.out.print("  ");
				}
			}
			e--;

			System.out.println();
		}

	}

}
