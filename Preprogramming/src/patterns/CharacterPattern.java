package patterns;

public class CharacterPattern {

	public static void main(String[] args) {
		int n = 4;
		System.out.println("----1----");
		char ch = 'A';
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();
		}
		System.out.println("----2----");

		for (int i = 1; i <= n; i++) {
			char ch1 = 'A';
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print(ch1 + " ");
					ch1++;

				}
			}

			System.out.println();
		}

		System.out.println("----3----");
		char ch2 = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j >= i) {
					System.out.print(ch2 + " ");

				} else {
					System.out.print("  ");
				}
			}
			ch2++;

			System.out.println();
		}

		System.out.println("----4----");
		char ch3 = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1) {
					System.out.print(ch3 + " ");

				} else {
					System.out.print("  ");
				}
			}
			ch3++;

			System.out.println();
		}

		System.out.println("----5----");
		char ch4 = 'D';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i + j <= n + 1) {
					System.out.print(ch4 + " ");

				} else {
					System.out.print("  ");
				}
			}
			ch4--;

			System.out.println();
		}
	}
}
