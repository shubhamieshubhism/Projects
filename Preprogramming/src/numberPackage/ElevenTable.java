package numberPackage;

public class ElevenTable {

	public static void main(String[] args) {
		tables(96);
	}

	private static void tables(int a) {
		for (int i = 1; i <= 10; i++) {
            System.out.println(a+ " * " + i + " = " + a * i);
        }
	}
}
