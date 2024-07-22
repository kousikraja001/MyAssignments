package week1assignment.day1;


// To print odd numbers
public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange = 10;
		
		System.out.println("Below are the odd numbers till "+maxRange);
		for (int i = 0; i < maxRange ; i++) {
			
			if (i%2==1) {
				System.out.println(i);
				
			}
		}

	}

}
