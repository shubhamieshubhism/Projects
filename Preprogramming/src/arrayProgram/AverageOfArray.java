package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("enter elements of an array");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("array elements are: ");
		System.out.println(Arrays.toString(a));
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum);

		double average = (double) sum / n;
		System.out.println("average" + average);

	}
}
