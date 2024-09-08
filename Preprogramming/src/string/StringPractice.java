package string;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		String s ="wel come";
		String a[]=s.split(" ");
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			String rev="";
			char[]b=a[i].toCharArray();
			for (int j = b.length-1; j>= 0; j--) {
				rev+=b[j];
			}
			System.out.println(rev+" ");
		}
	}

}
