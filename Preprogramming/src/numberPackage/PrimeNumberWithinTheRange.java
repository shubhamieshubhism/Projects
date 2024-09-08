package numberPackage;

public class PrimeNumberWithinTheRange {

	public static void main(String[] args) {
		/*int number = 1;
		int count = 0;
		while (number <= 100) {
			count = 0;
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(number);
			}
			number++;
		}*/
		
		//mam's approch
		for(int n=1;n<=20;n++) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(n);
			}
		}
		
		
	}
}
