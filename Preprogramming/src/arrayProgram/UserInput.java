package arrayProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		//creation of array
		int[] a = new int[size];
		
		//storing the element
		System.out.println("enter array element");
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are: ");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
	}

}
