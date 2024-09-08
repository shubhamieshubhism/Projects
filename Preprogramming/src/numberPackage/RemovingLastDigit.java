package numberPackage;

import java.util.Scanner;

public class RemovingLastDigit {

	public static void main(String[] args) {
		boolean control = true;
		while(control) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		int num = scn.nextInt();
		int lastdigit = num/10;
		System.out.println("last digit removed: "+lastdigit);
	}

	}

}
