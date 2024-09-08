package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size 1");
		int size1 = s.nextInt();
		int[] a = new int[size1];

		System.out.println("Enter size 2");
		int size2 = s.nextInt();
		int[] b = new int[size2];

		System.out.println("Enter element of the first array");
		for (int i = 0; i < size1; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Enter element of the second array");
		for (int i = 0; i < size2; i++) {
			b[i] = s.nextInt();
		}

		int[] c = new int[size1 + size2];
		int j = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < size1) {
				c[i] = a[i];
			} else {
				c[i] = b[j++];
			}
		}
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
		System.out.println("c: " + Arrays.toString(c));

	}

}
