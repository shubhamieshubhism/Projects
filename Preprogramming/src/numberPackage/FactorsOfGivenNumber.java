package numberPackage;

public class FactorsOfGivenNumber {
	public static void main(String[] args) {
		int num = 12;
		System.out.println("the factor of "+num);
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}
