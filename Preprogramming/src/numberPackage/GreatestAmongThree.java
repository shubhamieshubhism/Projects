package numberPackage;

public class GreatestAmongThree {
	//by using the ternary operatorok
       
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int greater = (a > b && a > c) ? a : ((b > a && b > c) ? b : c);
		System.out.println(greater);

	}

}
