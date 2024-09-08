package string;

public class OccurreneceOfCharacter {
public static void main(String[] args) {
	String s="hello world";
	char[] a=s.toCharArray();
	
	
	for(int i=0;i<a.length;i++) {
		int c=1;
		
		for (int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				c++;
				a[j]='1';
			}
		}
		if(a[i]!='1') {
			//System.out.println(a[i]+"-->"+c);
		}
		if(c==1) {
			System.out.println("The first non repetitive character is :"+s.charAt(0));
			break;
		}
		
	}
}
}
