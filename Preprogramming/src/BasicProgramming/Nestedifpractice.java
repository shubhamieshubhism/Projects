package BasicProgramming;

import java.util.Scanner;

public class Nestedifpractice {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 boolean control = true;
		 while (control) {
		 System.out.println("Enter the character");
	        char character=scn.next().charAt(0);
	        if(Character.isUpperCase(character)) {
	        	System.out.println("The characteris uppercase");
	        }else if(Character.isLowerCase(character)) {
	        	System.out.println("The characteris lowercase");
	        }else if(Character.isDigit(character)) {
	        	System.out.println("The character is number");
	        }else {
	        	System.out.println("The character is symbol");
	        } 
		 }
	}
}
