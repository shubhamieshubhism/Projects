package arrayProgram;

import java.util.Scanner;

public class EvenAndOddIndexValue {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		int[] a = new int[size];

		System.out.println("enter array element");
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Even index value are: ");
		int sum = 0;
		for (int i = 0; i < size; i++) {

			if (i % 2 == 0) {
				System.out.println(a[i] + " ");
				sum = sum + a[i];
			}
		}
		System.out.println("sum of even : " + sum);

		System.out.println("odd index value are: ");

		int osum = 0;
		for (int i = 0; i < size; i++) {
			if (i % 2 != 0) {
				System.out.println(a[i] + " ");
				osum = osum + a[i];

			}
		}
		System.out.println("sum of odd : " + osum);

	}
}
