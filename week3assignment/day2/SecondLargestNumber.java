package week3assignment.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();  // initialize the list 
		Collections.addAll(list1, 3, 2, 11, 4, 6, 7);    // add all the values to the list
		System.out.println(list1);
		
		Collections.sort(list1);                      // sorting the list
		System.out.println(list1);
		
		// list -  size() method return in human perspective(by considering index starts from 1)
		//                              in system perspective , index starts from 0
		System.out.println("The size of the list is " +list1.size());  //show number of values in the list
		
		int number = list1.size()-2;                        
		System.out.println(number);
		System.out.println("The size of the list is " +list1.get(number));
		

	}

}
