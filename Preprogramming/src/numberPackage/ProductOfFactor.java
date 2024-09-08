package numberPackage;

public class ProductOfFactor {

	public static void main(String[] args) {
		int num = 12;
		int pro = 1;
		System.out.println("the sum of factor of " + num);
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				pro = pro * i;
				System.out.println(i);
			}

		}
		System.out.println("product of factors is " + pro);

	}

}
