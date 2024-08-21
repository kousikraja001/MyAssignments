package week3assignment.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequenceOfNumbers {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 1, 2, 3, 4, 10, 6, 8);
		System.out.println(list1);
		
		Collections.sort(list1);
		System.out.println(list1);
		
		System.out.println("size of the list is " +list1.size());

		System.out.println("The missing numbers are : ");
		
		for (int i = list1.get(0); i < list1.get(list1.size()-1); i++) {

				if(!list1.contains(i)) {
					System.out.println(i);
			}
		}
	}
}
