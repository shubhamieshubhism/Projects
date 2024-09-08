package BasicProgramming;


public class Assignment1 {

	public static void main(String[] args) {
		//WAJP to check given number is even or odd.
		int a=2;
		if(a%2==0)
		{
			System.out.println("The number "+a+" is even.");
		}
		else 
		{
			System.out.println("The number is not a even instead it is a odd number");
		}
		
		//WAJPto find the given number is positive or negative
		int b= -10;
		if(b>0)
		{
			System.out.println("The number is positive");
		}
		else 
		{
			System.out.println("The number is negative");
		}
		//WAJP check whether the given number is 5 or not
		
		int c=13;
		if(c%5==0)
		{
			System.out.println("the given number is divisible by 5");
		}
		else
		{
			System.out.println("The given number is not divisible by 5");
		}
		//write a java program to find the largest number among two numbers
		int d=21;
		int e=20;
		if(d>e)
		{
			System.out.println(d+"largest number");
		}
		else
		{
			System.out.println(e+"largest number");
		}
		//tom wants to buy one shirt but shirt size must be small and tom having 1000 rupeess
		int money=1001;
		String shirtsize="small";
		
		if(money<=1000&&shirtsize=="small")
		{
			System.out.println("Tom you can buy the shirt");
		}
		else 
		{
			System.out.println("Tom you should wait for salary");
		}
		
	}

}
