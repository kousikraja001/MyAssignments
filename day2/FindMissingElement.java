package week1assignment.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] num = {1,4,3,2,8,6,7};
		//int[] num = {1,4,3,2,5,8,7};
		System.out.println("Before Sorting : "+Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("After sorting : " +Arrays.toString(num));
		
		for (int i = 1; i < num.length; i++) {
			
			if((num[i] - i) != 1)
			{
				System.out.println("Missing number is "+(i+1));
				break;
			}
			
		}

	}

}
