package week3assignment.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersectionOfNumbers {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();  // initialize the list 
		Collections.addAll(list1, 3, 2, 11, 4, 6, 7);    // add all the values to the list
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();// initialize the list
		Collections.addAll(list2, 1, 2, 8, 4, 9, 7);  // add all the values to the list
		System.out.println(list2);
		
		for (int i = 0; i < list1.size(); i++) {     //iteration list1 values
			
			
			for (int j = 0; j < list2.size(); j++) {   //iteration list2 values
				
				
				if(list1.get(i)==list2.get(j)) {      //compares list1 and list2 values
					
					System.out.println(list1.get(i));  //prints intersection of list1 value
				
			}else {
				System.out.println("No inserction value in both list");
			}
			
		}

	  }
	}
}
