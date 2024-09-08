package BasicProgramming;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		//we cannot pass float and double value in switch 
		//because there is a possibility of data loss
		//we cannot pass long float double and boolean in switch
		//There is no typecasting and due to data loss too and also long is greater datatype.
		//we can pass expression --> that should return int value not a boolean value
		int a=2;
		switch(a) {
		//switch(10.1):compile time error 
		//swutch(true,a==2): cpmpile time error
		case 1:{
			System.out.println("one");	
		}
		break;
		//break ==> it is a control transfer statement 
		//we can use break inside loop or in a switch not outside.
		case 2:{
			//we cannot pass a on 2's place
			// case a: compile time error
			//becausse we can pass only constant values.
			
			System.out.println("two");
		}
		break;
		case 2+1:{
			//THIS IS POSSIBLE 
			//COMPILE TIME SUCCESS
			System.out.println("three");
		}
		break;
		default:{
			System.out.println("invalid input");
		}
		}
		
		
		////WAJP that takes a month (as an integer) 
		//as input and display the which month that is using switch statement
		
		int mon=8;
		switch(mon) {
		case 1: {
			System.out.println("Jan");
		}
		break;
		case 2: {
			System.out.println("Feb");
		}
		break;
		case 3: {
			System.out.println("Mar");
		}
		break;
		case 4: {
			System.out.println("April");
		}
		break;
		case 5: {
			System.out.println("may");
		}
		break;
		case 6: {
			System.out.println("Jun");
		}
		break;
		case 7: {
			System.out.println("Jul");
		}
		break;
		case 8: {
			System.out.println("Aug");
		}
		break;
		case 9: {
			System.out.println("Sep");
		}
		break;
		case 10: {
			System.out.println("Oct");
		}break;
		case 11: {
			System.out.println("Nov");
		}
		break;
		case 12: {
			System.out.println("Dec");
		}
		break;
		default:{
			System.out.println("Invalid input");
		}	
		}
		//default can be used in anywhere inside the block 
		//but now we have to give break for default too
		//because if not it will execute all the values 
		//after default.
		int num =2;
		switch(num) {
		case 1:{
			System.out.println("Hello");	
		}break;
		default:{
			System.out.println("invalid");
		}break;
		case 2 :{
			System.out.println("Good morning");
		}break;
		}
		
		//WAJP using switch case 
		//take two input from user
		//1.add 2.subtract 3multiply 4.division
		
		
	
		int num1=20;
		int num2=2;
		int input=4;
		switch(input) {
		case 1:{
			System.out.println(num1+num2);
		}break;
		case 2:{
			System.out.println(num1-num2);
		}break;
		case 3:{
			System.out.println(num1*num2);
		}break;
		case 4:{
			System.out.println(num1/num2);
		}break;
		default:{
			System.out.println("Invalid input");
		}
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two number");
		int x = scn.nextInt();
		int y = scn.nextInt();
		boolean control=true;
		while (control) {
			
		System.out.println("\n-->1.Addition \n-->2.substraction \n-->3.multiplication \n-->4 division");
		
		int operation = scn.nextInt();
		switch(operation) {
		case 1:{
			System.out.println("addition:"+ (x+y));
		}break;
		case 2:{
			System.out.println("subtraction:" + (x-y));
		}break;
		case 3:{
			System.out.println("multiplication"+(x*y));
		}break;
		case 4:{
			System.out.println("division"+(x/y));
		}break;
		default:{
		System.out.println("invalid input");
		}
		}
		}
	}

}
