package string;

public class RemoveVowels {

	public static void main(String[] args) {
		String s="welcome";
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				System.out.println(s.charAt(i));
			}
	}

}
}
