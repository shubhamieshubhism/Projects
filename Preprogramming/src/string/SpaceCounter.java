package string;

public class SpaceCounter {

	public static void main(String[] args) {
		String s="   Hello   world   ";
		int scount=0;
		for(int i = 0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				scount++;
			}
		}
		System.out.println("number of spaces: "+scount);

	}

}
