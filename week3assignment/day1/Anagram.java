package week3assignment.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 
		String text1 = "stops";
		String text2 = "potss";
		int t1 = text1.length();
		System.out.println(t1);
		int t2 = text2.length(); 
		System.out.println(t2);
		if(t1==t2) {						//checking the length of the strings
			
			char[] tt1=text1.toCharArray(); //text1 converting to character array
			char[] tt2=text2.toCharArray(); //text2 converting to character array
			Arrays.sort(tt1);				//sorting the tt1 array
			Arrays.sort(tt2);				//sorting the tt2 array
			
			System.out.println(tt1);
			System.out.println(tt2);
			
			if(Arrays.equals(tt1, tt2)) {     //checks the value of sorted arrays are equal or not
				System.out.println("The given strings are Anagram");
			}
			else {
				System.out.println("The given strings are not an Anagram");
			}
			
			
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
