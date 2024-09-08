package loopingstatements;

import java.util.Scanner;

public class LoopAssignment1 {

	public static void main(String[] args) {
		/*WAJP to print positive even number 
		between the reanje (-5 to 5)
		by using while, for , do while loop*/
		/*System.out.println("using while loop");
		int i=-5;
		while(i<=5)
		{
			if(i>=0)
				if(i%2==0) {
					System.out.println("i="+i);
				}
			i++;
		}
		
        System.out.println("using for loop");
		for(int j=-5;j<=5;j++) {
			if(j>=0)
				if(j%2==0) {
					System.out.println("j="+j);
				}
			
		}
		System.out.println("using do while loop");
		int p=-5;
		do {
			if(p>=0) {
				if(p%2==0) {
					System.out.println("p="+p);
				}
			}
			p++;
		}while(p<=5);*/
		
		
		
		//WAJP which print a message "wlcome"
		//for the user you need to ask user to print welcome againn
		//stop to print welcome
	    Scanner s = new Scanner(System.in);
	    char ch;
		do {
			System.out.println("welcome");
			System.out.println("can i print once again?");
			System.out.println("if type y for yes  type n for no");
			ch=s.next().charAt(0);
			
		}while(ch=='y');
		System.out.println("Thank you");
		

}
}
