package numberPackage;

public class SumOfFactorial {

	public static void main(String[] args) {
		int number = 5;
        int fac = 1;
        int sum =0;
        for (int i = 1; i <= number; i++) {
            fac = fac* i;
            sum+=fac;
        }
        System.out.println("sum of factorial is: " + sum);
		


	}

}
