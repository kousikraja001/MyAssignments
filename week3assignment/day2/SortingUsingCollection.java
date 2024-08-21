package week3assignment.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> list1  = new ArrayList<String>();
		Collections.addAll(list1, "HCL", "Wipro", "Aspire Systems", "CTS");
		Collections.sort(list1);
		System.out.println(list1);
		
		for (int i = list1.size()-1; i >= 0; i--) {
			 
			System.out.print(list1.get(i)+ " ");
			
			
		}

	}

}
