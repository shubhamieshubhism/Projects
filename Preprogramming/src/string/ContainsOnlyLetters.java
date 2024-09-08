package string;

public class ContainsOnlyLetters {
	public static void main(String[] args) {
		String s = "Shubham ";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				c++;
			} else {
				System.out.println(s.charAt(i));
				break;
			}

		}
		if (c == s.length()) {
			System.out.println("String contains only letters");
		} else {
			System.out.println("String does not contain letters");
		}
	}

}
