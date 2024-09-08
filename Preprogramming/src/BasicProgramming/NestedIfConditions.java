package BasicProgramming;

import java.util.Scanner;

public class NestedIfConditions {

	public static void main(String[] args) {
		//to donate blood 
		//1. they will check age >18 years
		//2. they will check weight =>55kg
		/*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight (in kgs): ");
        int weight = scanner.nextInt();

        if (age >= 18) 
           {
            if (weight >= 55) 
            {
                System.out.println("You are eligible to donate blood.");
            }
            else 
            {
                System.out.println("Sorry, you are not eligible to donate blood due to low weight.");
            }
        } else {
            System.out.println("Sorry, you are not eligible to donate blood due to low age.");
        }

        scanner.close();*/
        
        //take iput from user (int)
        //check the number is even or odd
        //if number is even check that number divisible by 6 or not
        //if the number is odd check that number is divisible by 3
       /* boolean control = true;
        while (control) {
			
		
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        if(num%2==0)
        {
        if(num%6==0)
        {
        	System.out.println("The number is even & divisible by 6:");
        }
        else
        {
        	System.out.println("The number is even but not divisible by 6");
        }
        }
        else{
        	if(num%3==0)
        	{
        		System.out.println("The number is odd & divisible by 3");
        	}
        	else
        	{
        		System.out.println("The number is odd & not divisible by 3");
        	}
        }    
        }*/
        
        
        //take input from character one character
        //check that character is uppercase or lowercase or numbers or special charecter
        Scanner scn = new Scanner(System.in);
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


	


