package BasicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class TaskAfterMock {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 1.ask user to enter the number
		System.out.println("Enter number");
		int num = s.nextInt();
		int count = 0;
		int n1 = num;
		while (num > 0) {
			num /= 10;
			count++;
		}
		// 2.create array with size(take count as a size)
		int[] a = new int[count];

		// 3.reverse given number
		int rev = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			rev = (rev * 10) + rem;
			n1 /= 10;
		}
		System.out.println("reverse value is " + rev);

		// 4. extract digit from reverse container and store it in a array
		int i = 0;
		while (rev > 0) {
			int rem = rev % 10;
			a[i] = rem;
			i++;
			rev = rev / 10;
		}
		System.out.println("Array elements are:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		// 5.prime digits
		System.out.println("                   ");
		System.out.println("prime element are: ");
		for (int k = 0; k < count; k++) {
			int c = 0;
			for (int l = 1; l <= a[k]; l++) {
				if (a[k] % l == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(a[k] + " ");
			}
		}

	}
}
