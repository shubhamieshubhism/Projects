package string;

import java.util.Arrays;

public class Occurence_of_a_character {

	public static void main(String[] args) {
		String inputString = "hello world";
		char[]a=inputString.toCharArray();
		System.out.println(Arrays.toString(a));
		char targetChar = 'l';
		int occurrenceCount = countOccurences(inputString, targetChar);
		System.out.println("The character '" + targetChar + "'is occurred " + occurrenceCount + " times");

	}

	public static int countOccurences(String str, char target) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				count++;
			}

		}
		return count;
	}
}
