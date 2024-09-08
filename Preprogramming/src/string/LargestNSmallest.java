package string;

import java.util.Arrays;

public class LargestNSmallest {
	public static void main(String[] args) {
		String s = "hi hello welcome bye";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		int max = a[0].length();
		int min = a[0].length();
		// traverse arry
		int k = 0, l = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i].length()) {
				max = a[i].length();
				k = i;
			}
			if (min > a[i].length()) {
				min = a[i].length();
				l = i;
			}
		}
		System.out.println("largest string: " + a[k]);
		System.out.println("smallest string: " + a[l]);

	}

}
