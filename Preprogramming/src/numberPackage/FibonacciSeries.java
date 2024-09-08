package numberPackage;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the series");
		int series = scn.nextInt();
		int a = 0;
		int b = 1;
		// System.out.println(a+" "+b);
		for (int i = 1; i <= series; i++) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}

	}

}
