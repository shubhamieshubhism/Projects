package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1.ask user to enter a number 
 * 2.create array with size (take count as size of
 * an array 
 * 3.reverse n1 
 * 4.extract each digit store it into array 
 * 5.check array
 * element and entered number should be same 
 * 6.find average of an array 
 * 7.check array is xylem or phloem
 */

public class TaskAssignment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// step 1
		System.out.println("Enter number");
		int num = s.nextInt();
		int n1 = num;
		// step 2 counting digits
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		System.out.println(count);

		// create array
		int[] a = new int[count];
		// reverse n1 because numb has been already became zero
		int rev = 0;
		while (n1 > 0) {
			int rem = n1 % 10;
			rev = rev * 10 + rem;
			n1 /= 10;
		}
		System.out.println(rev);
		// step 4 extract digit from reverse container
		int i = 0;
		while (rev > 0) {
			int rem = rev % 10;
			a[i] = rem;
			i++;

			rev /= 10;
		}
		System.out.println(Arrays.toString(a));

		// step 5 check the array is xylem or phloem.
		// we need to declare outer and inner sum

		int first = a[0], last = a[count - 1];
		int isum = 0, osum = first + last;

		for (int j = 1; j <= count - 2; j++) {

			isum = isum + a[j];
		}
		System.out.println(isum + " " + osum);
		if (isum == osum) {
			System.out.println("The array is xylem");
		} else {
			System.out.println("The array is phloem");
		}

	}

}
