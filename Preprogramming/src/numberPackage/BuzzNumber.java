package numberPackage;

public class BuzzNumber {

	public static void main(String[] args) {
		int n=14;
		if(n%7==0&&n%10==7) {
			System.out.println(n+" is buzz number");
		}else {
			System.out.println(n+" is not a buzz number");
		}
	}
}
