package string;

public class ContainsOnlyDigit {
	public static void main(String[] args) {
		
		String s = "1224";
		int c=0;
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				c++;
			}else {
				break;
			}
			
		}
		if(c==s.length()) {
			System.out.println("String contains only digits");
		}else {
			System.out.println("String does not contain digit");
		}
	}

}
