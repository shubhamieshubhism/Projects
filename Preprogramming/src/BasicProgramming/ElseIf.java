package BasicProgramming;

public class ElseIf {

	public static void main(String[] args) 
	{
		int marks =70;
		if(marks>=80&& marks<=100)
		{
			System.out.println("A GRADE ");
		}
		else if(marks>=60&&marks<=80)
		{
			System.out.println("B GRADE");
		}
		else if(marks>=35&&marks<=60)
		{
			System.out.println("C GRADE");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		//WAJPthat takes an integeras inputand check if its's 
		//positive, nrgative or zero.
		
		int num = -88;
		if(num>0)
		{
			System.out.println("The number is positive");
		}
		else if(num<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("The number is zero");
		}
		
		//WAJP that takes a month (as an integer) 
		//as input and display the which month that is
		
		int mon=1;
		
		if(mon==1)
		{
			System.out.println("This is january");
		}
		else if(mon==2)
		{
			System.out.println("This is february");
		}
		else if(mon==3)
		{
			System.out.println("This is march");
		}
		else if(mon==4)
		{
			System.out.println("This is april");
		}
		else if(mon==5)
		{
			System.out.println("This is may");
		}
		else if(mon==6)
		{
			System.out.println("This is june");
		}
		else if(mon==7)
		{
			System.out.println("This is july");
		}
		else if(mon==8)
		{
			System.out.println("This is august");
		}
		else if(mon==9)
		{
			System.out.println("This is september");
		}
		else if(mon==10)
		{
			System.out.println("This is october");
		}
		else if(mon==11)
		{
			System.out.println("This is november");
		}
		else if(mon==12)
		{
			System.out.println("This is december");
		}
		else
		{
			System.out.println("You have entered invalid input");
		}

	}

}
