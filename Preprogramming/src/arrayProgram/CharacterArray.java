package arrayProgram;

import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		//size
		System.out.println("enter size");
		int size= s.nextInt();
		//create array
		char [] ch = new char[size];
		//stroe the array elements
		System.out.println("Enter array elements");
		for(int i = 0;i<size;i++) {
			ch[i]=s.next().charAt(0);//passing 0 means it ll accept only one value in a string
			//ptint it 
			
		}
		System.out.println("array elements are");
		for(int i=0;i<size;i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		System.out.println("ASCII values: ");
		for(int i=0;i<size;i++) {
			System.out.println(ch[i]+"-->"+(int)ch[i]);
		}
	
		
		

	}

}
