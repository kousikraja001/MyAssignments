package week1assignment.day1;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the number: ");
	     int n = sc.nextInt();
		
		for (int i = 2; i <= n; i++) {
			
				if (n%i !=0 && n%1 == 0) {
					System.out.println(n+ " is prime number");
					
				} else {
					
					System.out.println(n+ " is not prime number");
				}
				break;	
			
		}

	}

}
