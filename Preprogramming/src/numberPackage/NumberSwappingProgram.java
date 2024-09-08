package numberPackage;

public class NumberSwappingProgram {

	public static void main(String[] args) {
		
		//with temporary variable
		int a=100;
		System.out.println("before swapping a is "+a);
		int b=900;
		System.out.println("before swapping b is "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The swapped numbers are:");
        System.out.println("a after swapping = " + a);
        System.out.println("b after swapping = " + b);

        
      //without temporary variable
        int x = 10;
        int y = 20;

        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

       
        x = x + y;
        //10+20=30-->x=30
        y = x - y;
        //30-20=10-->y=10
        x = x - y;
        //30-10=20-->x=20

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

	}


