package numberPackage;

public class XylemOrPhloem {

	public static void main(String[] args) {
		/**
		 * xylem or phloem = outer sum is equal to
		 * inner sum
		 */
		int n=121,Isum=0,Osum=0;
		int last=n%10;n=n/10;
		while(n>9) {
			int rem=n%10;
			Isum=Isum+rem;
			n=n/10;
		}
		Osum=n+last;
		if(Osum==Isum) {
			System.out.println("Xylem");
		}else {
			System.out.println("Phloem");
		}
	}
}
