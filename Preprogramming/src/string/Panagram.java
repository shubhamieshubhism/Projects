package string;

import java.util.Arrays;

public class Panagram {
	public static void main(String[] args) {
		String s = "a1bcdefghijklmnopqrstuvwxy";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = '%';
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] >= 'a' && a[i] <= 'z') && a[i] != '%') {
				count++;
			}
		}
		System.out.println("Number of letters: " + count);
		if (count == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not a panagram");
		}
	}

}
