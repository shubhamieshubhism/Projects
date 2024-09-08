package string;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		String s=" Hello  world ";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				System.out.print(s.charAt(i)+" ");
			}
		}

	}

}
