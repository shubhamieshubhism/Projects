package numberPackage;

public class GCDGreatestCommonDivisor {

	public static void main(String[] args) {
		int a = 12;
		int b = 16;
		int gcd = 0;
		for(int i=1;i<=a&&i<=b;i++) {
			
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);

	}


}
