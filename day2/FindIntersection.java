package week1assignment.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int a[] = {3,2,11,4,6,7}; 
		int b[] = {1,2,8,4,9,7}; 
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0;  j< b.length; j++) {
				
				if (a[i]==b[j]) {
					System.out.println("The intersection number is "+a[i]);
					
				}
			
					
			}
		}

	}

}
