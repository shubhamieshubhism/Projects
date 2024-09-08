package loopingstatements;

public class ForLopp {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			System.out.println("ok");
		}
		
		for(int w=3,p=1;p<=10;p++) {
			System.out.println(w+"*"+p+"="+p*3);
			
		}
	//WAJP to print positive even number between range(-5to+5)
		for(int i=-5;i<=5;i++) {
			if(i>=0) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			
			int j=1;
			for(System.out.println("hi");j<=5&&j>=10 ; System.out.println("bye")) {
				System.out.println("ok");
				j++;
			}
			
			/*//condition will be needing boolean value that
			//is why it is showing error.
			for(System.out.println("hi");System.out.println("hello");System.out.println("bye")){
				System.out.println("ok");
			}*/
			
			/*for(int i=1;i<=5;i++);
			{
				System.out.println("hi");
			}
			for(int i=1;true;i++);
			//unreachable code
			{
				System.out.println("ok");
			}
			
			int y = 1;
			while(y<=5);{
				System.out.println("hello");
			}
			while(true) {
				System.out.println("ok");
			}*/
	}
	}
}


