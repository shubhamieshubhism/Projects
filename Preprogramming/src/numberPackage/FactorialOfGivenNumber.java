package numberPackage;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		int number = 5;
        int fac = 1;
        for (int i = 1; i <= number; i++) {
            fac = fac* i;
        }
        System.out.println("Factorial of " + number + " is: " + fac);
		

	}

}
