package string;

public class CountCharacters {

	public static void main(String[] args) {
		String s = "Tom.A@123";
		int vcount = 0, ccount = 0, dcount = 0, scount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vcount++;
			} else if ((ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u' || ch != 'A' || ch != 'E'
					|| ch != 'I' || ch != 'O' || ch != 'U') && (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ccount++;

			} else if (ch >= '0' && ch <= '9') {
				dcount++;
			} else {
				scount++;
			}
		}
		System.out.println("vowels: " + vcount);
		System.out.println("digit: " + dcount);
		System.out.println("consonants: " + ccount);
		System.out.println("special character: " + scount);

	}

}
