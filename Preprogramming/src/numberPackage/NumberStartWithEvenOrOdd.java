package numberPackage;

public class NumberStartWithEvenOrOdd {

	public static void main(String[] args) {
		int num = 642;
		while (num > 9) {
			num /= 10;
		}
		if (num % 2 == 0) {
			System.out.println("number start with even digit");
		} else {
			System.out.println("number start with odd digit");
		}
	}
}
