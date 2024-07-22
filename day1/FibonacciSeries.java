package week1assignment.day1;

public class FibonacciSeries {
	
	
	public static void main(String[] args) {
		int a=0,b=1,c;
		int range=8;
		System.out.println("First "+range+" fibonacci series numbers");
		System.out.print(a+" "+b);
;
		for (int i = 0; i < range-2; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			
		}
		

		}

	
	}



